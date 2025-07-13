package p048d2;

/* renamed from: d2.g */
/* loaded from: classes.dex */
public final class C1268g {
    /* renamed from: a */
    public static final void m3728a(android.view.View r4) {
            android.graphics.drawable.Drawable r0 = r4.getBackground()
            if (r0 != 0) goto L41
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L41
            android.content.Context r0 = r4.getContext()
            java.lang.String r1 = "context"
            p214m2.C4339q.m9703h(r0, r1)
            r1 = 2130969423(0x7f04034f, float:1.7547527E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            if (r1 == 0) goto L3e
            android.content.res.Resources$Theme r0 = r0.getTheme()
            r2 = 1
            int[] r2 = new int[r2]
            int r1 = r1.intValue()
            r3 = 0
            r2[r3] = r1
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r3)     // Catch: java.lang.Throwable -> L39
            r0.recycle()
            goto L3e
        L39:
            r4 = move-exception
            r0.recycle()
            throw r4
        L3e:
            r4.setBackground(r2)
        L41:
            return
    }
}
