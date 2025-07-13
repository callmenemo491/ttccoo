package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.k0 */
/* loaded from: classes.dex */
public abstract class AbstractC0598k0 extends androidx.recyclerview.widget.RecyclerView.AbstractC0560p {

    /* renamed from: a */
    public androidx.recyclerview.widget.RecyclerView f3457a;

    /* renamed from: b */
    public final androidx.recyclerview.widget.RecyclerView.AbstractC0562r f3458b;

    /* renamed from: androidx.recyclerview.widget.k0$a */
    public class a extends androidx.recyclerview.widget.RecyclerView.AbstractC0562r {

        /* renamed from: a */
        public boolean f3459a;

        /* renamed from: b */
        public final /* synthetic */ androidx.recyclerview.widget.AbstractC0598k0 f3460b;

        public a(androidx.recyclerview.widget.AbstractC0598k0 r1) {
                r0 = this;
                r0.f3460b = r1
                r0.<init>()
                r1 = 0
                r0.f3459a = r1
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562r
        /* renamed from: a */
        public void mo1905a(androidx.recyclerview.widget.RecyclerView r1, int r2) {
                r0 = this;
                if (r2 != 0) goto Le
                boolean r1 = r0.f3459a
                if (r1 == 0) goto Le
                r1 = 0
                r0.f3459a = r1
                androidx.recyclerview.widget.k0 r1 = r0.f3460b
                r1.m2082d()
            Le:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562r
        /* renamed from: b */
        public void mo1906b(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
                r0 = this;
                if (r2 != 0) goto L4
                if (r3 == 0) goto L7
            L4:
                r1 = 1
                r0.f3459a = r1
            L7:
                return
        }
    }

    public AbstractC0598k0() {
            r1 = this;
            r1.<init>()
            androidx.recyclerview.widget.k0$a r0 = new androidx.recyclerview.widget.k0$a
            r0.<init>(r1)
            r1.f3458b = r0
            return
    }

    /* renamed from: a */
    public void m2081a(androidx.recyclerview.widget.RecyclerView r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.f3457a
            if (r0 != r3) goto L5
            return
        L5:
            if (r0 == 0) goto L16
            androidx.recyclerview.widget.RecyclerView$r r1 = r2.f3458b
            java.util.List<androidx.recyclerview.widget.RecyclerView$r> r0 = r0.f3161g1
            if (r0 == 0) goto L10
            r0.remove(r1)
        L10:
            androidx.recyclerview.widget.RecyclerView r0 = r2.f3457a
            r1 = 0
            r0.setOnFlingListener(r1)
        L16:
            r2.f3457a = r3
            if (r3 == 0) goto L48
            androidx.recyclerview.widget.RecyclerView$p r3 = r3.getOnFlingListener()
            if (r3 != 0) goto L40
            androidx.recyclerview.widget.RecyclerView r3 = r2.f3457a
            androidx.recyclerview.widget.RecyclerView$r r0 = r2.f3458b
            r3.m1756h(r0)
            androidx.recyclerview.widget.RecyclerView r3 = r2.f3457a
            r3.setOnFlingListener(r2)
            android.widget.Scroller r3 = new android.widget.Scroller
            androidx.recyclerview.widget.RecyclerView r0 = r2.f3457a
            android.content.Context r0 = r0.getContext()
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            r3.<init>(r0, r1)
            r2.m2082d()
            goto L48
        L40:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "An instance of OnFlingListener already set."
            r3.<init>(r0)
            throw r3
        L48:
            return
    }

    /* renamed from: b */
    public abstract int[] mo2026b(androidx.recyclerview.widget.RecyclerView.AbstractC0557m r1, android.view.View r2);

    /* renamed from: c */
    public abstract android.view.View mo2027c(androidx.recyclerview.widget.RecyclerView.AbstractC0557m r1);

    /* renamed from: d */
    public void m2082d() {
            r10 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r10.f3457a
            if (r0 != 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$m r0 = r0.getLayoutManager()
            if (r0 != 0) goto Lc
            return
        Lc:
            android.view.View r1 = r10.mo2027c(r0)
            if (r1 != 0) goto L13
            return
        L13:
            int[] r0 = r10.mo2026b(r0, r1)
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L21
            r2 = r0[r3]
            if (r2 == 0) goto L2e
        L21:
            androidx.recyclerview.widget.RecyclerView r4 = r10.f3457a
            r5 = r0[r1]
            r6 = r0[r3]
            r9 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 0
            r4.m1759i0(r5, r6, r7, r8, r9)
        L2e:
            return
    }
}
