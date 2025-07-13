package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.u */
/* loaded from: classes.dex */
public class C1176u extends androidx.recyclerview.widget.RecyclerView.AbstractC0549e<com.google.android.material.datepicker.C1176u.a> {

    /* renamed from: d */
    public final android.content.Context f6137d;

    /* renamed from: e */
    public final com.google.android.material.datepicker.C1154a f6138e;

    /* renamed from: f */
    public final com.google.android.material.datepicker.InterfaceC1158c<?> f6139f;

    /* renamed from: g */
    public final com.google.android.material.datepicker.C1161f.e f6140g;

    /* renamed from: h */
    public final int f6141h;

    /* renamed from: com.google.android.material.datepicker.u$a */
    public static class a extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

        /* renamed from: u */
        public final android.widget.TextView f6142u;

        /* renamed from: v */
        public final com.google.android.material.datepicker.MaterialCalendarGridView f6143v;

        public a(android.widget.LinearLayout r6, boolean r7) {
                r5 = this;
                r5.<init>(r6)
                r0 = 2131362357(0x7f0a0235, float:1.8344492E38)
                android.view.View r0 = r6.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r5.f6142u = r0
                java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
                n0.s r1 = new n0.s
                java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
                r3 = 2131362655(0x7f0a035f, float:1.8345097E38)
                r4 = 28
                r1.<init>(r3, r2, r4)
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                r1.m10551e(r0, r2)
                r1 = 2131362352(0x7f0a0230, float:1.8344482E38)
                android.view.View r6 = r6.findViewById(r1)
                com.google.android.material.datepicker.MaterialCalendarGridView r6 = (com.google.android.material.datepicker.MaterialCalendarGridView) r6
                r5.f6143v = r6
                if (r7 != 0) goto L33
                r6 = 8
                r0.setVisibility(r6)
            L33:
                return
        }
    }

    public C1176u(android.content.Context r4, com.google.android.material.datepicker.InterfaceC1158c<?> r5, com.google.android.material.datepicker.C1154a r6, com.google.android.material.datepicker.C1161f.e r7) {
            r3 = this;
            r3.<init>()
            com.google.android.material.datepicker.r r0 = r6.f6041Y
            com.google.android.material.datepicker.r r1 = r6.f6042Z
            com.google.android.material.datepicker.r r2 = r6.f6044b0
            int r0 = r0.m3427e(r2)
            if (r0 > 0) goto L5d
            int r0 = r2.m3427e(r1)
            if (r0 > 0) goto L55
            int r0 = com.google.android.material.datepicker.C1174s.f6129d0
            int r1 = com.google.android.material.datepicker.C1161f.f6068f1
            android.content.res.Resources r1 = r4.getResources()
            r2 = 2131165515(0x7f07014b, float:1.794525E38)
            int r1 = r1.getDimensionPixelSize(r2)
            int r0 = r0 * r1
            boolean r1 = com.google.android.material.datepicker.C1169n.m3418M0(r4)
            if (r1 == 0) goto L35
            android.content.res.Resources r1 = r4.getResources()
            int r1 = r1.getDimensionPixelSize(r2)
            goto L36
        L35:
            r1 = 0
        L36:
            r3.f6137d = r4
            int r0 = r0 + r1
            r3.f6141h = r0
            r3.f6138e = r6
            r3.f6139f = r5
            r3.f6140g = r7
            r4 = 1
            androidx.recyclerview.widget.RecyclerView$f r5 = r3.f3228a
            boolean r5 = r5.m1812a()
            if (r5 != 0) goto L4d
            r3.f3229b = r4
            return
        L4d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Cannot change whether this adapter has stable IDs while the adapter has registered observers."
            r4.<init>(r5)
            throw r4
        L55:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "currentPage cannot be after lastPage"
            r4.<init>(r5)
            throw r4
        L5d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "firstPage cannot be after currentPage"
            r4.<init>(r5)
            throw r4
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: b */
    public int mo1521b() {
            r1 = this;
            com.google.android.material.datepicker.a r0 = r1.f6138e
            int r0 = r0.f6046d0
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: c */
    public long mo1810c(int r3) {
            r2 = this;
            com.google.android.material.datepicker.a r0 = r2.f6138e
            com.google.android.material.datepicker.r r0 = r0.f6041Y
            com.google.android.material.datepicker.r r3 = r0.m3430o(r3)
            java.util.Calendar r3 = r3.f6122Y
            long r0 = r3.getTimeInMillis()
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: e */
    public void mo1523e(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r4, int r5) {
            r3 = this;
            com.google.android.material.datepicker.u$a r4 = (com.google.android.material.datepicker.C1176u.a) r4
            com.google.android.material.datepicker.a r0 = r3.f6138e
            com.google.android.material.datepicker.r r0 = r0.f6041Y
            com.google.android.material.datepicker.r r5 = r0.m3430o(r5)
            android.widget.TextView r0 = r4.f6142u
            android.view.View r1 = r4.f3208a
            android.content.Context r1 = r1.getContext()
            java.lang.String r1 = r5.m3429l(r1)
            r0.setText(r1)
            com.google.android.material.datepicker.MaterialCalendarGridView r4 = r4.f6143v
            r0 = 2131362352(0x7f0a0230, float:1.8344482E38)
            android.view.View r4 = r4.findViewById(r0)
            com.google.android.material.datepicker.MaterialCalendarGridView r4 = (com.google.android.material.datepicker.MaterialCalendarGridView) r4
            com.google.android.material.datepicker.s r0 = r4.m3399a()
            if (r0 == 0) goto L80
            com.google.android.material.datepicker.s r0 = r4.m3399a()
            com.google.android.material.datepicker.r r0 = r0.f6130Y
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L80
            r4.invalidate()
            com.google.android.material.datepicker.s r5 = r4.m3399a()
            java.util.Collection<java.lang.Long> r0 = r5.f6132a0
            java.util.Iterator r0 = r0.iterator()
        L43:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r0.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r5.m3437f(r4, r1)
            goto L43
        L57:
            com.google.android.material.datepicker.c<?> r0 = r5.f6131Z
            if (r0 == 0) goto L91
            java.util.Collection r0 = r0.m3405E()
            java.util.Iterator r0 = r0.iterator()
        L63:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L77
            java.lang.Object r1 = r0.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r5.m3437f(r4, r1)
            goto L63
        L77:
            com.google.android.material.datepicker.c<?> r0 = r5.f6131Z
            java.util.Collection r0 = r0.m3405E()
            r5.f6132a0 = r0
            goto L91
        L80:
            com.google.android.material.datepicker.s r0 = new com.google.android.material.datepicker.s
            com.google.android.material.datepicker.c<?> r1 = r3.f6139f
            com.google.android.material.datepicker.a r2 = r3.f6138e
            r0.<init>(r5, r1, r2)
            int r5 = r5.f6125b0
            r4.setNumColumns(r5)
            r4.setAdapter(r0)
        L91:
            com.google.android.material.datepicker.t r5 = new com.google.android.material.datepicker.t
            r5.<init>(r3, r4)
            r4.setOnItemClickListener(r5)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: g */
    public androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 mo1524g(android.view.ViewGroup r3, int r4) {
            r2 = this;
            android.content.Context r4 = r3.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0 = 2131558532(0x7f0d0084, float:1.8742382E38)
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r3, r1)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            android.content.Context r3 = r3.getContext()
            boolean r3 = com.google.android.material.datepicker.C1169n.m3418M0(r3)
            if (r3 == 0) goto L2e
            androidx.recyclerview.widget.RecyclerView$n r3 = new androidx.recyclerview.widget.RecyclerView$n
            r0 = -1
            int r1 = r2.f6141h
            r3.<init>(r0, r1)
            r4.setLayoutParams(r3)
            com.google.android.material.datepicker.u$a r3 = new com.google.android.material.datepicker.u$a
            r0 = 1
            r3.<init>(r4, r0)
            goto L33
        L2e:
            com.google.android.material.datepicker.u$a r3 = new com.google.android.material.datepicker.u$a
            r3.<init>(r4, r1)
        L33:
            return r3
    }

    /* renamed from: i */
    public com.google.android.material.datepicker.C1173r m3438i(int r2) {
            r1 = this;
            com.google.android.material.datepicker.a r0 = r1.f6138e
            com.google.android.material.datepicker.r r0 = r0.f6041Y
            com.google.android.material.datepicker.r r2 = r0.m3430o(r2)
            return r2
    }

    /* renamed from: j */
    public int m3439j(com.google.android.material.datepicker.C1173r r2) {
            r1 = this;
            com.google.android.material.datepicker.a r0 = r1.f6138e
            com.google.android.material.datepicker.r r0 = r0.f6041Y
            int r2 = r0.m3431r(r2)
            return r2
    }
}
