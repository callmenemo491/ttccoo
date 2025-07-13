package androidx.viewpager2.widget;

/* renamed from: androidx.viewpager2.widget.e */
/* loaded from: classes.dex */
public class C0650e extends androidx.viewpager2.widget.ViewPager2.AbstractC0639e {

    /* renamed from: a */
    public final /* synthetic */ androidx.viewpager2.widget.ViewPager2 f3789a;

    public C0650e(androidx.viewpager2.widget.ViewPager2 r1) {
            r0 = this;
            r0.f3789a = r1
            r0.<init>()
            return
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0639e
    /* renamed from: c */
    public void mo2186c(int r2) {
            r1 = this;
            androidx.viewpager2.widget.ViewPager2 r2 = r1.f3789a
            r2.clearFocus()
            androidx.viewpager2.widget.ViewPager2 r2 = r1.f3789a
            boolean r2 = r2.hasFocus()
            if (r2 == 0) goto L15
            androidx.viewpager2.widget.ViewPager2 r2 = r1.f3789a
            androidx.recyclerview.widget.RecyclerView r2 = r2.f3742j0
            r0 = 2
            r2.requestFocus(r0)
        L15:
            return
    }
}
