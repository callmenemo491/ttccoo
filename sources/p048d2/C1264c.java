package p048d2;

/* renamed from: d2.c */
/* loaded from: classes.dex */
public class C1264c extends androidx.recyclerview.widget.RecyclerView.AbstractC0549e<androidx.recyclerview.widget.RecyclerView.AbstractC0546b0> {

    /* renamed from: d */
    public p032c2.InterfaceC0854b f6741d;

    /* renamed from: e */
    public p019b2.InterfaceC0655a<?> f6742e;

    public C1264c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: b */
    public int mo1521b() {
            r1 = this;
            b2.a<?> r0 = r1.f6742e
            if (r0 == 0) goto L9
            int r0 = r0.size()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: c */
    public long mo1810c(int r3) {
            r2 = this;
            b2.a<?> r0 = r2.f6742e
            r1 = 0
            if (r0 == 0) goto L20
            java.lang.Object r3 = r0.get(r3)
            e2.c r0 = r2.m3727j()
            java.lang.String r3 = r2.m3726i(r3)
            a2.a r3 = r0.m4099a(r3)
            boolean r0 = r3 instanceof p067e2.C1511d
            if (r0 != 0) goto L1a
            goto L1b
        L1a:
            r1 = r3
        L1b:
            e2.d r1 = (p067e2.C1511d) r1
            r0 = -1
            return r0
        L20:
            p214m2.C4339q.m9712v()
            throw r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: d */
    public int mo1522d(int r3) {
            r2 = this;
            b2.a<?> r0 = r2.f6742e
            if (r0 == 0) goto L36
            java.lang.Object r3 = r0.get(r3)
            if (r3 == 0) goto L36
            java.lang.String r3 = r2.m3726i(r3)
            e2.c r0 = r2.m3727j()
            java.lang.String r1 = "name"
            p214m2.C4339q.m9707l(r3, r1)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r0.f7345c
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L26
            int r3 = r0.intValue()
            return r3
        L26:
            java.lang.String r0 = "Didn't find item type for class "
            java.lang.String r3 = p064e.C1493g.m4049a(r0, r3)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L36:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "No data source available."
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: e */
    public void mo1523e(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r7, int r8) {
            r6 = this;
            java.lang.String r0 = "holder"
            p214m2.C4339q.m9707l(r7, r0)
            b2.a<?> r0 = r6.f6742e
            r1 = 0
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r0.get(r8)
            e2.c r2 = r6.m3727j()
            java.lang.String r3 = r6.m3726i(r0)
            a2.a r2 = r2.m4099a(r3)
            java.lang.String r3 = "$this$bindViewHolder"
            p214m2.C4339q.m9707l(r2, r3)
            java.lang.String r3 = "viewHolder"
            p214m2.C4339q.m9707l(r7, r3)
            java.lang.String r3 = "item"
            p214m2.C4339q.m9707l(r0, r3)
            e2.d r2 = p067e2.C1509b.m4097b(r2)
            android.view.View r3 = r7.f3208a
            r4 = 2131362521(0x7f0a02d9, float:1.8344825E38)
            r3.setTag(r4, r7)
            a2.b r4 = r2.f7353h
            b2.a<?> r4 = r4.f9b
            r5 = 2131362520(0x7f0a02d8, float:1.8344823E38)
            r3.setTag(r5, r4)
            mh.q<?, ? super java.lang.Integer, ?, ch.l> r2 = r2.f7349d
            r3 = 3
            boolean r3 = p239nh.C4840t.m10856b(r2, r3)
            if (r3 != 0) goto L49
            r2 = r1
        L49:
            if (r2 == 0) goto L55
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r2.mo115i(r7, r8, r0)
            ch.l r8 = (ch.C0985l) r8
        L55:
            android.view.View r7 = r7.f3208a
            r7.setTag(r5, r1)
            return
        L5b:
            p214m2.C4339q.m9712v()
            throw r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: g */
    public androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 mo1524g(android.view.ViewGroup r7, int r8) {
            r6 = this;
            java.lang.String r0 = "parent"
            p214m2.C4339q.m9707l(r7, r0)
            e2.c r0 = r6.m3727j()
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.f7343a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L114
            int r0 = r0.intValue()
            android.content.Context r1 = r7.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 0
            android.view.View r7 = r1.inflate(r0, r7, r2)
            e2.c r0 = r6.m3727j()
            a2.a r8 = r0.m4100b(r8)
            java.lang.String r0 = "view"
            p214m2.C4339q.m9703h(r7, r0)
            java.lang.String r0 = "$this$createViewHolder"
            p214m2.C4339q.m9707l(r8, r0)
            java.lang.String r0 = "itemView"
            p214m2.C4339q.m9707l(r7, r0)
            e2.d r0 = p067e2.C1509b.m4097b(r8)
            a2.b r1 = r0.f7353h
            mh.p<? super f2.b<? extends java.lang.Object>, ? super java.lang.Integer, ch.l> r2 = r0.f7346a
            if (r2 != 0) goto L4d
            java.util.Objects.requireNonNull(r1)
            goto L55
        L4d:
            android.view.View$OnClickListener r2 = r0.f7351f
            r7.setOnClickListener(r2)
            p048d2.C1268g.m3728a(r7)
        L55:
            mh.p<? super f2.b<? extends java.lang.Object>, ? super java.lang.Integer, ch.l> r2 = r0.f7347b
            if (r2 != 0) goto L5d
            java.util.Objects.requireNonNull(r1)
            goto L65
        L5d:
            android.view.View$OnLongClickListener r1 = r0.f7352g
            r7.setOnLongClickListener(r1)
            p048d2.C1268g.m3728a(r7)
        L65:
            mh.l<? super android.view.View, ?> r1 = r0.f7348c
            r2 = 1
            boolean r3 = p239nh.C4840t.m10856b(r1, r2)
            if (r3 != 0) goto L6f
            r1 = 0
        L6f:
            if (r1 == 0) goto Lfb
            java.lang.Object r7 = r1.mo107b(r7)
            androidx.recyclerview.widget.RecyclerView$b0 r7 = (androidx.recyclerview.widget.RecyclerView.AbstractC0546b0) r7
            e2.d r0 = p067e2.C1509b.m4097b(r8)
            java.util.List<e2.d$a<?, ?, ?>> r1 = r0.f7350e
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L85
            goto Lfa
        L85:
            java.util.List<e2.d$a<?, ?, ?>> r0 = r0.f7350e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L90:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lad
            java.lang.Object r3 = r0.next()
            r4 = r3
            e2.d$a r4 = (p067e2.C1511d.a) r4
            java.lang.Class<VH extends androidx.recyclerview.widget.RecyclerView$b0> r4 = r4.f7355a
            java.lang.Class r5 = r7.getClass()
            boolean r4 = p214m2.C4339q.m9702c(r4, r5)
            if (r4 == 0) goto L90
            r1.add(r3)
            goto L90
        Lad:
            java.util.Iterator r0 = r1.iterator()
        Lb1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lfa
            java.lang.Object r1 = r0.next()
            e2.d$a r1 = (p067e2.C1511d.a) r1
            mh.l<VH extends androidx.recyclerview.widget.RecyclerView$b0, VT extends android.view.View> r3 = r1.f7356b
            if (r3 == 0) goto Lf2
            p239nh.C4840t.m10855a(r3, r2)
            mh.q<f2.b<? extends IT>, java.lang.Integer, VT extends android.view.View, ch.l> r1 = r1.f7357c
            if (r1 == 0) goto Lea
            r4 = 3
            p239nh.C4840t.m10855a(r1, r4)
            java.lang.Object r3 = r3.mo107b(r7)
            android.view.View r3 = (android.view.View) r3
            e2.a r4 = new e2.a
            r4.<init>(r8, r7, r1)
            java.lang.String r1 = "$this$onClickDebounced"
            p214m2.C4339q.m9707l(r3, r1)
            java.lang.String r1 = "click"
            p214m2.C4339q.m9707l(r4, r1)
            d2.b r1 = new d2.b
            r1.<init>(r4)
            r3.setOnClickListener(r1)
            goto Lb1
        Lea:
            ch.i r7 = new ch.i
            java.lang.String r8 = "null cannot be cast to non-null type com.afollestad.recyclical.viewholder.SelectionStateProvider<kotlin.Any>.(kotlin.Int, kotlin.Any) -> kotlin.Unit"
            r7.<init>(r8)
            throw r7
        Lf2:
            ch.i r7 = new ch.i
            java.lang.String r8 = "null cannot be cast to non-null type (com.afollestad.recyclical.ViewHolder /* = androidx.recyclerview.widget.RecyclerView.ViewHolder */) -> android.view.View"
            r7.<init>(r8)
            throw r7
        Lfa:
            return r7
        Lfb:
            java.lang.String r7 = "View holder creator not provided for item definition "
            java.lang.StringBuilder r7 = android.support.v4.media.C0144c.m256a(r7)
            java.lang.String r8 = r0.f7354i
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L114:
            java.lang.String r7 = "Didn't find layout for type "
            java.lang.String r7 = android.support.v4.media.C0142a.m254a(r7, r8)
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: h */
    public void mo1541h(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r3) {
            r2 = this;
            java.lang.String r0 = "holder"
            p214m2.C4339q.m9707l(r3, r0)
            int r0 = r3.m1789f()
            r1 = -1
            if (r0 <= r1) goto L2f
            b2.a<?> r1 = r2.f6742e
            if (r1 == 0) goto L2f
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L2f
            java.lang.String r0 = r2.m3726i(r0)
            e2.c r1 = r2.m3727j()
            a2.a r0 = r1.m4099a(r0)
            java.lang.String r1 = "$this$recycleViewHolder"
            p214m2.C4339q.m9707l(r0, r1)
            java.lang.String r1 = "viewHolder"
            p214m2.C4339q.m9707l(r3, r1)
            p067e2.C1509b.m4097b(r0)
        L2f:
            return
    }

    /* renamed from: i */
    public final java.lang.String m3726i(java.lang.Object r1) {
            r0 = this;
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            return r1
    }

    /* renamed from: j */
    public final p067e2.C1510c m3727j() {
            r2 = this;
            c2.b r0 = r2.f6741d
            if (r0 == 0) goto Lb
            e2.c r0 = r0.mo2520a()
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not attached!"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
