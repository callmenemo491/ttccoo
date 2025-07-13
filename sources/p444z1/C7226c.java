package p444z1;

/* renamed from: z1.c */
/* loaded from: classes.dex */
public class C7226c implements androidx.recyclerview.widget.RecyclerView.InterfaceC0559o {
    public C7226c(androidx.viewpager2.widget.ViewPager2 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0559o
    /* renamed from: b */
    public void mo1900b(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r3 = (androidx.recyclerview.widget.RecyclerView.C0558n) r3
            int r0 = r3.width
            r1 = -1
            if (r0 != r1) goto L10
            int r3 = r3.height
            if (r3 != r1) goto L10
            return
        L10:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Pages must fill the whole ViewPager2 (use match_parent)"
            r3.<init>(r0)
            throw r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0559o
    /* renamed from: d */
    public void mo1901d(android.view.View r1) {
            r0 = this;
            return
    }
}
