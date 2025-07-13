package androidx.viewpager2.widget;

/* renamed from: androidx.viewpager2.widget.b */
/* loaded from: classes.dex */
public final class C0647b extends androidx.viewpager2.widget.ViewPager2.AbstractC0639e {

    /* renamed from: a */
    public final androidx.recyclerview.widget.LinearLayoutManager f3770a;

    /* renamed from: b */
    public androidx.viewpager2.widget.ViewPager2.InterfaceC0641g f3771b;

    public C0647b(androidx.recyclerview.widget.LinearLayoutManager r1) {
            r0 = this;
            r0.<init>()
            r0.f3770a = r1
            return
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0639e
    /* renamed from: a */
    public void mo2184a(int r1) {
            r0 = this;
            return
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0639e
    /* renamed from: b */
    public void mo2185b(int r5, float r6, int r7) {
            r4 = this;
            androidx.viewpager2.widget.ViewPager2$g r7 = r4.f3771b
            if (r7 != 0) goto L5
            return
        L5:
            float r6 = -r6
            r7 = 0
            r0 = 0
        L8:
            androidx.recyclerview.widget.LinearLayoutManager r1 = r4.f3770a
            int r1 = r1.m1891z()
            if (r0 >= r1) goto L4d
            androidx.recyclerview.widget.LinearLayoutManager r1 = r4.f3770a
            android.view.View r1 = r1.m1889y(r0)
            if (r1 == 0) goto L29
            androidx.recyclerview.widget.LinearLayoutManager r2 = r4.f3770a
            int r2 = r2.m1868R(r1)
            int r2 = r2 - r5
            float r2 = (float) r2
            float r2 = r2 + r6
            androidx.viewpager2.widget.ViewPager2$g r3 = r4.f3771b
            r3.m2189a(r1, r2)
            int r0 = r0 + 1
            goto L8
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.util.Locale r6 = java.util.Locale.US
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r7] = r0
            androidx.recyclerview.widget.LinearLayoutManager r7 = r4.f3770a
            int r7 = r7.m1891z()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0 = 1
            r1[r0] = r7
            java.lang.String r7 = "LayoutManager returned a null child at pos %d/%d while transforming pages"
            java.lang.String r6 = java.lang.String.format(r6, r7, r1)
            r5.<init>(r6)
            throw r5
        L4d:
            return
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0639e
    /* renamed from: c */
    public void mo2186c(int r1) {
            r0 = this;
            return
    }
}
