package p359ud;

/* renamed from: ud.q */
/* loaded from: classes.dex */
public final class C6394q extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final io.tacocrypto.app.database.AppDatabase f24884c;

    /* renamed from: d */
    public final androidx.lifecycle.C0437d0<java.lang.String> f24885d;

    /* renamed from: e */
    public final androidx.lifecycle.LiveData<java.util.List<id.C3130a>> f24886e;

    /* renamed from: ud.q$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.util.List<? extends id.C3130a>, java.lang.String, java.util.List<? extends id.C3130a>> {

        /* renamed from: Z */
        public static final p359ud.C6394q.a f24887Z = null;

        static {
                ud.q$a r0 = new ud.q$a
                r0.<init>()
                p359ud.C6394q.a.f24887Z = r0
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
        public java.util.List<? extends id.C3130a> mo122l(java.util.List<? extends id.C3130a> r7, java.lang.String r8) {
                r6 = this;
                java.util.List r7 = (java.util.List) r7
                java.lang.String r8 = (java.lang.String) r8
                r0 = 0
                r1 = 1
                if (r8 == 0) goto L11
                int r2 = r8.length()
                if (r2 != 0) goto Lf
                goto L11
            Lf:
                r2 = 0
                goto L12
            L11:
                r2 = 1
            L12:
                if (r2 == 0) goto L19
                if (r7 != 0) goto L4c
            L16:
                dh.k r7 = p062dh.C1475k.f7237Y
                goto L4c
            L19:
                if (r7 == 0) goto L16
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r7 = r7.iterator()
            L24:
                boolean r3 = r7.hasNext()
                if (r3 == 0) goto L4b
                java.lang.Object r3 = r7.next()
                r4 = r3
                id.a r4 = (id.C3130a) r4
                java.lang.String r5 = r4.f12557Z
                boolean r5 = p362uh.C6467m.m13062S(r5, r8, r1)
                if (r5 != 0) goto L44
                java.lang.String r4 = r4.f12558a0
                boolean r4 = p362uh.C6467m.m13062S(r4, r8, r1)
                if (r4 == 0) goto L42
                goto L44
            L42:
                r4 = 0
                goto L45
            L44:
                r4 = 1
            L45:
                if (r4 == 0) goto L24
                r2.add(r3)
                goto L24
            L4b:
                r7 = r2
            L4c:
                return r7
        }
    }

    public C6394q(p238nd.C4728b0 r2, io.tacocrypto.app.database.AppDatabase r3) {
            r1 = this;
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r2 = "appDatabase"
            p214m2.C4339q.m9706k(r3, r2)
            r1.<init>()
            r1.f24884c = r3
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f24885d = r2
            hd.b r3 = r3.mo7712o()
            androidx.lifecycle.LiveData r3 = r3.mo7435b()
            ud.q$a r0 = p359ud.C6394q.a.f24887Z
            androidx.lifecycle.LiveData r2 = p185k7.C4038x4.m9089b(r3, r2, r0)
            r1.f24886e = r2
            return
    }
}
