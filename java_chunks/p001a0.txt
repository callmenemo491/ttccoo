package p001a0;

/* renamed from: a0.a */
/* loaded from: classes.dex */
public class C0001a {

    /* renamed from: a */
    public static final java.lang.ThreadLocal<android.graphics.Matrix> f2a = null;

    /* renamed from: b */
    public static final java.lang.ThreadLocal<android.graphics.RectF> f3b = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p001a0.C0001a.f2a = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p001a0.C0001a.f3b = r0
            return
    }

    /* renamed from: a */
    public static void m1a(android.view.ViewParent r2, android.view.View r3, android.graphics.Matrix r4) {
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L1e
            if (r0 == r2) goto L1e
            android.view.View r0 = (android.view.View) r0
            m1a(r2, r0, r4)
            int r2 = r0.getScrollX()
            int r2 = -r2
            float r2 = (float) r2
            int r0 = r0.getScrollY()
            int r0 = -r0
            float r0 = (float) r0
            r4.preTranslate(r2, r0)
        L1e:
            int r2 = r3.getLeft()
            float r2 = (float) r2
            int r0 = r3.getTop()
            float r0 = (float) r0
            r4.preTranslate(r2, r0)
            android.graphics.Matrix r2 = r3.getMatrix()
            boolean r2 = r2.isIdentity()
            if (r2 != 0) goto L3c
            android.graphics.Matrix r2 = r3.getMatrix()
            r4.preConcat(r2)
        L3c:
            return
    }
}
