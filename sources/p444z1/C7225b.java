package p444z1;

/* renamed from: z1.b */
/* loaded from: classes.dex */
public final class C7225b {

    /* renamed from: b */
    public static final android.view.ViewGroup.MarginLayoutParams f27797b = null;

    /* renamed from: a */
    public androidx.recyclerview.widget.LinearLayoutManager f27798a;

    static {
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            p444z1.C7225b.f27797b = r0
            r1 = 0
            r0.setMargins(r1, r1, r1, r1)
            return
    }

    public C7225b(androidx.recyclerview.widget.LinearLayoutManager r1) {
            r0 = this;
            r0.<init>()
            r0.f27798a = r1
            return
    }

    /* renamed from: a */
    public static boolean m14287a(android.view.View r5) {
            boolean r0 = r5 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 == 0) goto L2a
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.animation.LayoutTransition r0 = r5.getLayoutTransition()
            r2 = 1
            if (r0 == 0) goto L15
            boolean r0 = r0.isChangingLayout()
            if (r0 == 0) goto L15
            return r2
        L15:
            int r0 = r5.getChildCount()
            r3 = 0
        L1a:
            if (r3 >= r0) goto L2a
            android.view.View r4 = r5.getChildAt(r3)
            boolean r4 = m14287a(r4)
            if (r4 == 0) goto L27
            return r2
        L27:
            int r3 = r3 + 1
            goto L1a
        L2a:
            return r1
    }
}
