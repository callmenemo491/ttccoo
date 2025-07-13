package p389w7;

/* renamed from: w7.b */
/* loaded from: classes.dex */
public class C6818b {
    /* renamed from: a */
    public static void m13900a(p389w7.C6817a r0, android.view.View r1, android.widget.FrameLayout r2) {
            r2 = 0
            m13902c(r0, r1, r2)
            android.widget.FrameLayout r2 = r0.m13890d()
            if (r2 == 0) goto L12
            android.widget.FrameLayout r1 = r0.m13890d()
            r1.setForeground(r0)
            goto L19
        L12:
            android.view.ViewOverlay r1 = r1.getOverlay()
            r1.add(r0)
        L19:
            return
    }

    /* renamed from: b */
    public static void m13901b(p389w7.C6817a r1, android.view.View r2) {
            if (r1 != 0) goto L3
            return
        L3:
            android.widget.FrameLayout r0 = r1.m13890d()
            if (r0 == 0) goto L12
            android.widget.FrameLayout r1 = r1.m13890d()
            r2 = 0
            r1.setForeground(r2)
            goto L19
        L12:
            android.view.ViewOverlay r2 = r2.getOverlay()
            r2.remove(r1)
        L19:
            return
    }

    /* renamed from: c */
    public static void m13902c(p389w7.C6817a r1, android.view.View r2, android.widget.FrameLayout r3) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.getDrawingRect(r0)
            r1.setBounds(r0)
            r1.m13898l(r2, r3)
            return
    }
}
