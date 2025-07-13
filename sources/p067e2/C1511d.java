package p067e2;

import androidx.recyclerview.widget.RecyclerView.AbstractC0546b0;

/* renamed from: e2.d */
/* loaded from: classes.dex */
public final class C1511d<IT, VH extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0> implements p003a2.InterfaceC0004a<IT, VH> {

    /* renamed from: a */
    public mh.InterfaceC4624p<? super p086f2.InterfaceC1987b<? extends java.lang.Object>, ? super java.lang.Integer, ch.C0985l> f7346a;

    /* renamed from: b */
    public mh.InterfaceC4624p<? super p086f2.InterfaceC1987b<? extends java.lang.Object>, ? super java.lang.Integer, ch.C0985l> f7347b;

    /* renamed from: c */
    public mh.InterfaceC4620l<? super android.view.View, ?> f7348c;

    /* renamed from: d */
    public mh.InterfaceC4625q<?, ? super java.lang.Integer, ?, ch.C0985l> f7349d;

    /* renamed from: e */
    public java.util.List<p067e2.C1511d.a<?, ?, ?>> f7350e;

    /* renamed from: f */
    public final android.view.View.OnClickListener f7351f;

    /* renamed from: g */
    public final android.view.View.OnLongClickListener f7352g;

    /* renamed from: h */
    public final p003a2.C0005b f7353h;

    /* renamed from: i */
    public final java.lang.String f7354i;

    /* renamed from: e2.d$a */
    public static final class a<IT, VH extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0, VT extends android.view.View> {

        /* renamed from: a */
        public final java.lang.Class<VH> f7355a;

        /* renamed from: b */
        public final mh.InterfaceC4620l<VH, VT> f7356b;

        /* renamed from: c */
        public final mh.InterfaceC4625q<p086f2.InterfaceC1987b<? extends IT>, java.lang.Integer, VT, ch.C0985l> f7357c;

        public a(java.lang.Class<VH> r1, mh.InterfaceC4620l<? super VH, ? extends VT> r2, mh.InterfaceC4625q<? super p086f2.InterfaceC1987b<? extends IT>, ? super java.lang.Integer, ? super VT, ch.C0985l> r3) {
                r0 = this;
                r0.<init>()
                r0.f7355a = r1
                r0.f7356b = r2
                r0.f7357c = r3
                return
        }

        public boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r2 == r3) goto L29
                boolean r0 = r3 instanceof p067e2.C1511d.a
                if (r0 == 0) goto L27
                e2.d$a r3 = (p067e2.C1511d.a) r3
                java.lang.Class<VH extends androidx.recyclerview.widget.RecyclerView$b0> r0 = r2.f7355a
                java.lang.Class<VH extends androidx.recyclerview.widget.RecyclerView$b0> r1 = r3.f7355a
                boolean r0 = p214m2.C4339q.m9702c(r0, r1)
                if (r0 == 0) goto L27
                mh.l<VH extends androidx.recyclerview.widget.RecyclerView$b0, VT extends android.view.View> r0 = r2.f7356b
                mh.l<VH extends androidx.recyclerview.widget.RecyclerView$b0, VT extends android.view.View> r1 = r3.f7356b
                boolean r0 = p214m2.C4339q.m9702c(r0, r1)
                if (r0 == 0) goto L27
                mh.q<f2.b<? extends IT>, java.lang.Integer, VT extends android.view.View, ch.l> r0 = r2.f7357c
                mh.q<f2.b<? extends IT>, java.lang.Integer, VT extends android.view.View, ch.l> r3 = r3.f7357c
                boolean r3 = p214m2.C4339q.m9702c(r0, r3)
                if (r3 == 0) goto L27
                goto L29
            L27:
                r3 = 0
                return r3
            L29:
                r3 = 1
                return r3
        }

        public int hashCode() {
                r3 = this;
                java.lang.Class<VH extends androidx.recyclerview.widget.RecyclerView$b0> r0 = r3.f7355a
                r1 = 0
                if (r0 == 0) goto La
                int r0 = r0.hashCode()
                goto Lb
            La:
                r0 = 0
            Lb:
                int r0 = r0 * 31
                mh.l<VH extends androidx.recyclerview.widget.RecyclerView$b0, VT extends android.view.View> r2 = r3.f7356b
                if (r2 == 0) goto L16
                int r2 = r2.hashCode()
                goto L17
            L16:
                r2 = 0
            L17:
                int r0 = r0 + r2
                int r0 = r0 * 31
                mh.q<f2.b<? extends IT>, java.lang.Integer, VT extends android.view.View, ch.l> r2 = r3.f7357c
                if (r2 == 0) goto L22
                int r1 = r2.hashCode()
            L22:
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "ChildClickData(viewHolderType="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.Class<VH extends androidx.recyclerview.widget.RecyclerView$b0> r1 = r2.f7355a
                r0.append(r1)
                java.lang.String r1 = ", child="
                r0.append(r1)
                mh.l<VH extends androidx.recyclerview.widget.RecyclerView$b0, VT extends android.view.View> r1 = r2.f7356b
                r0.append(r1)
                java.lang.String r1 = ", callback="
                r0.append(r1)
                mh.q<f2.b<? extends IT>, java.lang.Integer, VT extends android.view.View, ch.l> r1 = r2.f7357c
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: e2.d$b */
    public static final class b implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final /* synthetic */ p067e2.C1511d f7358Y;

        public b(p067e2.C1511d r1) {
                r0 = this;
                r0.f7358Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View r4) {
                r3 = this;
                d2.a r0 = p048d2.C1262a.f6738b
                java.lang.String r1 = "itemView"
                p214m2.C4339q.m9703h(r4, r1)
                boolean r0 = r0.m3725a(r4)
                if (r0 == 0) goto L3e
                androidx.recyclerview.widget.RecyclerView$b0 r4 = p067e2.C1509b.m4098c(r4)
                int r4 = r4.m1789f()
                e2.d r0 = r3.f7358Y
                f2.b r0 = p067e2.C1509b.m4096a(r0, r4)
                r1 = 0
                e2.d r2 = r3.f7358Y     // Catch: java.lang.Throwable -> L37
                mh.p<? super f2.b<? extends java.lang.Object>, ? super java.lang.Integer, ch.l> r2 = r2.f7346a     // Catch: java.lang.Throwable -> L37
                if (r2 == 0) goto L2c
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L37
                java.lang.Object r4 = r2.mo122l(r0, r4)     // Catch: java.lang.Throwable -> L37
                ch.l r4 = (ch.C0985l) r4     // Catch: java.lang.Throwable -> L37
            L2c:
                e2.d r4 = r3.f7358Y     // Catch: java.lang.Throwable -> L37
                a2.b r4 = r4.f7353h     // Catch: java.lang.Throwable -> L37
                java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Throwable -> L37
                p101fh.C2174f.m5717g(r0, r1)
                goto L3e
            L37:
                r4 = move-exception
                throw r4     // Catch: java.lang.Throwable -> L39
            L39:
                r1 = move-exception
                p101fh.C2174f.m5717g(r0, r4)
                throw r1
            L3e:
                return
        }
    }

    /* renamed from: e2.d$c */
    public static final class c implements android.view.View.OnLongClickListener {

        /* renamed from: Y */
        public final /* synthetic */ p067e2.C1511d f7359Y;

        public c(p067e2.C1511d r1) {
                r0 = this;
                r0.f7359Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(android.view.View r4) {
                r3 = this;
                d2.a r0 = p048d2.C1262a.f6738b
                java.lang.String r1 = "itemView"
                p214m2.C4339q.m9703h(r4, r1)
                boolean r0 = r0.m3725a(r4)
                if (r0 == 0) goto L3e
                androidx.recyclerview.widget.RecyclerView$b0 r4 = p067e2.C1509b.m4098c(r4)
                int r4 = r4.m1789f()
                e2.d r0 = r3.f7359Y
                f2.b r0 = p067e2.C1509b.m4096a(r0, r4)
                r1 = 0
                e2.d r2 = r3.f7359Y     // Catch: java.lang.Throwable -> L37
                mh.p<? super f2.b<? extends java.lang.Object>, ? super java.lang.Integer, ch.l> r2 = r2.f7347b     // Catch: java.lang.Throwable -> L37
                if (r2 == 0) goto L2c
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L37
                java.lang.Object r4 = r2.mo122l(r0, r4)     // Catch: java.lang.Throwable -> L37
                ch.l r4 = (ch.C0985l) r4     // Catch: java.lang.Throwable -> L37
            L2c:
                e2.d r4 = r3.f7359Y     // Catch: java.lang.Throwable -> L37
                a2.b r4 = r4.f7353h     // Catch: java.lang.Throwable -> L37
                java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Throwable -> L37
                p101fh.C2174f.m5717g(r0, r1)
                goto L3e
            L37:
                r4 = move-exception
                throw r4     // Catch: java.lang.Throwable -> L39
            L39:
                r1 = move-exception
                p101fh.C2174f.m5717g(r0, r4)
                throw r1
            L3e:
                r4 = 1
                return r4
        }
    }

    public C1511d(p003a2.C0005b r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f7353h = r1
            r0.f7354i = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f7350e = r1
            e2.d$b r1 = new e2.d$b
            r1.<init>(r0)
            r0.f7351f = r1
            e2.d$c r1 = new e2.d$c
            r1.<init>(r0)
            r0.f7352g = r1
            return
    }

    @Override // p003a2.InterfaceC0004a
    /* renamed from: a */
    public p003a2.InterfaceC0004a<IT, VH> mo10a(mh.InterfaceC4624p<? super p086f2.InterfaceC1987b<? extends IT>, ? super java.lang.Integer, ch.C0985l> r2) {
            r1 = this;
            r0 = 2
            p239nh.C4840t.m10855a(r2, r0)
            r1.f7347b = r2
            return r1
    }

    @Override // p003a2.InterfaceC0004a
    /* renamed from: b */
    public p003a2.InterfaceC0004a<IT, VH> mo11b(mh.InterfaceC4624p<? super p086f2.InterfaceC1987b<? extends IT>, ? super java.lang.Integer, ch.C0985l> r2) {
            r1 = this;
            r0 = 2
            p239nh.C4840t.m10855a(r2, r0)
            r1.f7346a = r2
            return r1
    }

    @Override // p003a2.InterfaceC0004a
    /* renamed from: c */
    public p003a2.InterfaceC0004a<IT, VH> mo12c(mh.InterfaceC4620l<? super android.view.View, ? extends VH> r1, mh.InterfaceC4625q<? super VH, ? super java.lang.Integer, ? super IT, ch.C0985l> r2) {
            r0 = this;
            r0.f7348c = r1
            r0.f7349d = r2
            return r0
    }
}
