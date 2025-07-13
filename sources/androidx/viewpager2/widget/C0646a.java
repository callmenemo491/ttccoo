package androidx.viewpager2.widget;

/* renamed from: androidx.viewpager2.widget.a */
/* loaded from: classes.dex */
public final class C0646a extends androidx.viewpager2.widget.ViewPager2.AbstractC0639e {

    /* renamed from: a */
    public final java.util.List<androidx.viewpager2.widget.ViewPager2.AbstractC0639e> f3769a;

    public C0646a(int r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.f3769a = r0
            return
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0639e
    /* renamed from: a */
    public void mo2184a(int r3) {
            r2 = this;
            java.util.List<androidx.viewpager2.widget.ViewPager2$e> r0 = r2.f3769a     // Catch: java.util.ConcurrentModificationException -> L17
            java.util.Iterator r0 = r0.iterator()     // Catch: java.util.ConcurrentModificationException -> L17
        L6:
            boolean r1 = r0.hasNext()     // Catch: java.util.ConcurrentModificationException -> L17
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()     // Catch: java.util.ConcurrentModificationException -> L17
            androidx.viewpager2.widget.ViewPager2$e r1 = (androidx.viewpager2.widget.ViewPager2.AbstractC0639e) r1     // Catch: java.util.ConcurrentModificationException -> L17
            r1.mo2184a(r3)     // Catch: java.util.ConcurrentModificationException -> L17
            goto L6
        L16:
            return
        L17:
            r3 = move-exception
            r2.m2190d(r3)
            r3 = 0
            throw r3
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0639e
    /* renamed from: b */
    public void mo2185b(int r3, float r4, int r5) {
            r2 = this;
            java.util.List<androidx.viewpager2.widget.ViewPager2$e> r0 = r2.f3769a     // Catch: java.util.ConcurrentModificationException -> L17
            java.util.Iterator r0 = r0.iterator()     // Catch: java.util.ConcurrentModificationException -> L17
        L6:
            boolean r1 = r0.hasNext()     // Catch: java.util.ConcurrentModificationException -> L17
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()     // Catch: java.util.ConcurrentModificationException -> L17
            androidx.viewpager2.widget.ViewPager2$e r1 = (androidx.viewpager2.widget.ViewPager2.AbstractC0639e) r1     // Catch: java.util.ConcurrentModificationException -> L17
            r1.mo2185b(r3, r4, r5)     // Catch: java.util.ConcurrentModificationException -> L17
            goto L6
        L16:
            return
        L17:
            r3 = move-exception
            r2.m2190d(r3)
            r3 = 0
            throw r3
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0639e
    /* renamed from: c */
    public void mo2186c(int r3) {
            r2 = this;
            java.util.List<androidx.viewpager2.widget.ViewPager2$e> r0 = r2.f3769a     // Catch: java.util.ConcurrentModificationException -> L17
            java.util.Iterator r0 = r0.iterator()     // Catch: java.util.ConcurrentModificationException -> L17
        L6:
            boolean r1 = r0.hasNext()     // Catch: java.util.ConcurrentModificationException -> L17
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()     // Catch: java.util.ConcurrentModificationException -> L17
            androidx.viewpager2.widget.ViewPager2$e r1 = (androidx.viewpager2.widget.ViewPager2.AbstractC0639e) r1     // Catch: java.util.ConcurrentModificationException -> L17
            r1.mo2186c(r3)     // Catch: java.util.ConcurrentModificationException -> L17
            goto L6
        L16:
            return
        L17:
            r3 = move-exception
            r2.m2190d(r3)
            r3 = 0
            throw r3
    }

    /* renamed from: d */
    public final void m2190d(java.util.ConcurrentModificationException r3) {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Adding and removing callbacks during dispatch to callbacks is not supported"
            r0.<init>(r1, r3)
            throw r0
    }
}
