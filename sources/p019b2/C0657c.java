package p019b2;

/* renamed from: b2.c */
/* loaded from: classes.dex */
public class C0657c<IT> implements p019b2.InterfaceC0655a<IT> {

    /* renamed from: a */
    public java.util.List<IT> f3807a;

    /* renamed from: b */
    public p032c2.InterfaceC0854b f3808b;

    /* renamed from: b2.c$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<androidx.recyclerview.widget.RecyclerView.AbstractC0549e<?>, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ int f3809Z;

        public a(int r1) {
                r0 = this;
                r0.f3809Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(androidx.recyclerview.widget.RecyclerView.AbstractC0549e<?> r4) {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView$e r4 = (androidx.recyclerview.widget.RecyclerView.AbstractC0549e) r4
                java.lang.String r0 = "$receiver"
                p214m2.C4339q.m9707l(r4, r0)
                int r0 = r3.f3809Z
                androidx.recyclerview.widget.RecyclerView$f r4 = r4.f3228a
                r1 = 0
                r2 = 1
                r4.m1815d(r0, r2, r1)
                ch.l r4 = ch.C0985l.f5061a
                return r4
        }
    }

    /* renamed from: b2.c$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<androidx.recyclerview.widget.RecyclerView.AbstractC0549e<?>, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.recyclerview.widget.C0604o.d f3810Z;

        public b(androidx.recyclerview.widget.C0604o.d r1) {
                r0 = this;
                r0.f3810Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(androidx.recyclerview.widget.RecyclerView.AbstractC0549e<?> r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$e r3 = (androidx.recyclerview.widget.RecyclerView.AbstractC0549e) r3
                java.lang.String r0 = "$receiver"
                p214m2.C4339q.m9707l(r3, r0)
                androidx.recyclerview.widget.o$d r0 = r2.f3810Z
                androidx.recyclerview.widget.b r1 = new androidx.recyclerview.widget.b
                r1.<init>(r3)
                r0.m2098a(r1)
                ch.l r3 = ch.C0985l.f5061a
                return r3
        }
    }

    public C0657c(java.util.List r1, int r2) {
            r0 = this;
            r1 = r2 & 1
            if (r1 == 0) goto La
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto Lb
        La:
            r1 = 0
        Lb:
            java.lang.String r2 = "initialData"
            p214m2.C4339q.m9707l(r1, r2)
            r0.<init>()
            java.util.List r1 = p062dh.C1473i.m4009U(r1)
            r0.f3807a = r1
            return
    }

    @Override // p019b2.InterfaceC0655a
    /* renamed from: a */
    public void mo2200a() {
            r1 = this;
            r0 = 0
            r1.f3808b = r0
            return
    }

    @Override // p019b2.InterfaceC0655a
    /* renamed from: b */
    public void mo2201b(int r2) {
            r1 = this;
            b2.c$a r0 = new b2.c$a
            r0.<init>(r2)
            c2.b r2 = r1.f3808b
            if (r2 == 0) goto Lc
            r2.mo2521b(r0)
        Lc:
            return
    }

    @Override // p019b2.InterfaceC0655a
    /* renamed from: c */
    public void mo2202c(java.util.List<? extends IT> r3, mh.InterfaceC4624p<? super IT, ? super IT, java.lang.Boolean> r4, mh.InterfaceC4624p<? super IT, ? super IT, java.lang.Boolean> r5) {
            r2 = this;
            java.lang.String r0 = "newItems"
            p214m2.C4339q.m9707l(r3, r0)
            java.util.List<IT> r0 = r2.f3807a
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L31
            if (r4 == 0) goto L31
            if (r5 == 0) goto L31
            java.util.List<IT> r0 = r2.f3807a
            java.util.List r3 = p062dh.C1473i.m4009U(r3)
            r2.f3807a = r3
            d2.d r1 = new d2.d
            r1.<init>(r0, r3, r4, r5)
            androidx.recyclerview.widget.o$d r3 = androidx.recyclerview.widget.C0604o.m2096a(r1)
            b2.c$b r4 = new b2.c$b
            r4.<init>(r3)
            c2.b r3 = r2.f3808b
            if (r3 == 0) goto L40
            r3.mo2521b(r4)
            goto L40
        L31:
            java.util.List r3 = p062dh.C1473i.m4009U(r3)
            r2.f3807a = r3
            b2.b r3 = p019b2.C0656b.f3806Z
            c2.b r4 = r2.f3808b
            if (r4 == 0) goto L40
            r4.mo2521b(r3)
        L40:
            return
    }

    @Override // p019b2.InterfaceC0655a
    /* renamed from: d */
    public void mo2203d(p032c2.InterfaceC0854b r2) {
            r1 = this;
            c2.b r0 = r1.f3808b
            if (r0 == 0) goto L5
            return
        L5:
            r1.f3808b = r2
            b2.b r0 = p019b2.C0656b.f3806Z
            c2.a r2 = (p032c2.C0853a) r2
            r2.mo2521b(r0)
            return
    }

    @Override // p019b2.InterfaceC0655a
    public IT get(int r2) {
            r1 = this;
            java.util.List<IT> r0 = r1.f3807a
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // p019b2.InterfaceC0655a
    public boolean isEmpty() {
            r1 = this;
            java.util.List<IT> r0 = r1.f3807a
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // p019b2.InterfaceC0655a
    public int size() {
            r1 = this;
            java.util.List<IT> r0 = r1.f3807a
            int r0 = r0.size()
            return r0
    }
}
