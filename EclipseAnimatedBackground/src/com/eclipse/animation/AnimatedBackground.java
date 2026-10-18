package com.eclipse.animation;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.PlatformUI;

public class AnimatedBackground implements IStartup {

    @Override
    public void earlyStartup() {

        Display.getDefault().asyncExec(() -> {

            Shell eclipseShell =
                    PlatformUI.getWorkbench()
                               .getActiveWorkbenchWindow()
                               .getShell();

            Shell animationShell = new Shell(
                    eclipseShell,
                    SWT.NO_TRIM | SWT.NO_FOCUS
            );

            animationShell.setBackgroundMode(SWT.INHERIT_NONE);
            animationShell.setAlpha(255);

            Image animal = new Image(
                    Display.getDefault(),
                    getClass().getClassLoader()
                            .getResourceAsStream("images/shree.png")
            );

            Rectangle screen = eclipseShell.getClientArea();

            int x = 0;
            int y = screen.height - animal.getBounds().height - 50;

            animationShell.setBounds(
                    x,
                    y,
                    animal.getBounds().width,
                    animal.getBounds().height
            );

            animationShell.addPaintListener(e -> {
                e.gc.drawImage(animal, 0, 0);
            });

            animationShell.open();

            final int[] position = {0};

            Runnable moveAnimal = new Runnable() {
                @Override
                public void run() {

                    if (animationShell.isDisposed()) {
                        animal.dispose();
                        return;
                    }

                    position[0] += 5;

                    if (position[0] >
                            eclipseShell.getClientArea().width) {
                        position[0] = -animal.getBounds().width;
                    }

                    animationShell.setLocation(
                            position[0],
                            y
                    );

                    animationShell.redraw();

                    Display.getDefault().timerExec(
                            30,
                            this
                    );
                }
            };

            Display.getDefault().timerExec(100, moveAnimal);
        });
    }
}
