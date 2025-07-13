package je;

/* renamed from: je.j */
/* loaded from: classes.dex */
public final class C3588j extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f15717c;

    /* renamed from: d */
    public final androidx.lifecycle.C0437d0<java.lang.String> f15718d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<java.util.List<je.C3590l>> f15719e;

    /* renamed from: f */
    public final androidx.lifecycle.LiveData<java.util.List<je.C3590l>> f15720f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<vg.C6661b<ke.C4097a>> f15721g;

    /* renamed from: h */
    public java.util.List<je.C3579a> f15722h;

    /* renamed from: i */
    public p255od.C5194b0 f15723i;

    /* renamed from: je.j$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.util.List<? extends je.C3590l>, java.lang.String, java.util.List<? extends je.C3590l>> {

        /* renamed from: Z */
        public static final je.C3588j.a f15724Z = null;

        static {
                je.j$a r0 = new je.j$a
                r0.<init>()
                je.C3588j.a.f15724Z = r0
                return
        }

        public a() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.util.List<? extends je.C3590l> mo122l(java.util.List<? extends je.C3590l> r7, java.lang.String r8) {
                r6 = this;
                java.util.List r7 = (java.util.List) r7
                java.lang.String r8 = (java.lang.String) r8
                r0 = 0
                r1 = 1
                if (r8 == 0) goto L11
                boolean r2 = p362uh.C6463i.m13054K(r8)
                if (r2 == 0) goto Lf
                goto L11
            Lf:
                r2 = 0
                goto L12
            L11:
                r2 = 1
            L12:
                if (r2 != 0) goto L53
                if (r7 == 0) goto L1f
                boolean r2 = r7.isEmpty()
                if (r2 == 0) goto L1d
                goto L1f
            L1d:
                r2 = 0
                goto L20
            L1f:
                r2 = 1
            L20:
                if (r2 == 0) goto L23
                goto L53
            L23:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r7 = r7.iterator()
            L2c:
                boolean r3 = r7.hasNext()
                if (r3 == 0) goto L58
                java.lang.Object r3 = r7.next()
                r4 = r3
                je.l r4 = (je.C3590l) r4
                java.lang.String r5 = r4.f15725Y
                boolean r5 = p362uh.C6467m.m13062S(r5, r8, r1)
                if (r5 != 0) goto L4c
                java.lang.String r4 = r4.f15726Z
                boolean r4 = p362uh.C6467m.m13062S(r4, r8, r1)
                if (r4 == 0) goto L4a
                goto L4c
            L4a:
                r4 = 0
                goto L4d
            L4c:
                r4 = 1
            L4d:
                if (r4 == 0) goto L2c
                r2.add(r3)
                goto L2c
            L53:
                if (r7 != 0) goto L57
                dh.k r7 = p062dh.C1475k.f7237Y
            L57:
                r2 = r7
            L58:
                return r2
        }
    }

    public C3588j(p238nd.C4728b0 r3) {
            r2 = this;
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r3, r0)
            r2.<init>()
            r2.f15717c = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f15718d = r3
            androidx.lifecycle.d0 r0 = new androidx.lifecycle.d0
            r0.<init>()
            r2.f15719e = r0
            je.j$a r1 = je.C3588j.a.f15724Z
            androidx.lifecycle.LiveData r3 = p185k7.C4038x4.m9090c(r0, r3, r1)
            r2.f15720f = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f15721g = r3
            return
    }
}
