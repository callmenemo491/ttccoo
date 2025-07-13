package p131he;

/* renamed from: he.a */
/* loaded from: classes.dex */
public final class C3030a extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final ch.InterfaceC0977d f12197c;

    /* renamed from: d */
    public final androidx.lifecycle.C0437d0<md.C4578s0> f12198d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<java.lang.String> f12199e;

    /* renamed from: f */
    public final androidx.lifecycle.C0437d0<java.lang.String> f12200f;

    /* renamed from: he.a$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Boolean, java.util.List<? extends md.C4578s0>, java.lang.Boolean> {

        /* renamed from: Z */
        public static final p131he.C3030a.a f12201Z = null;

        static {
                he.a$a r0 = new he.a$a
                r0.<init>()
                p131he.C3030a.a.f12201Z = r0
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
        public java.lang.Boolean mo122l(java.lang.Boolean r2, java.util.List<? extends md.C4578s0> r3) {
                r1 = this;
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                java.util.List r3 = (java.util.List) r3
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                boolean r2 = p214m2.C4339q.m9702c(r2, r0)
                if (r2 == 0) goto Lf
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                goto L21
            Lf:
                r2 = 1
                if (r3 == 0) goto L1b
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L19
                goto L1b
            L19:
                r3 = 0
                goto L1c
            L1b:
                r3 = 1
            L1c:
                r2 = r2 ^ r3
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            L21:
                return r2
        }
    }

    /* renamed from: he.a$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f12202Z;

        public b(android.app.Application r1) {
                r0 = this;
                r0.f12202Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f12202Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    /* renamed from: he.a$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.String, md.C4578s0, java.lang.Double> {

        /* renamed from: Z */
        public static final p131he.C3030a.c f12203Z = null;

        static {
                he.a$c r0 = new he.a$c
                r0.<init>()
                p131he.C3030a.c.f12203Z = r0
                return
        }

        public c() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Double mo122l(java.lang.String r5, md.C4578s0 r6) {
                r4 = this;
                java.lang.String r5 = (java.lang.String) r5
                md.s0 r6 = (md.C4578s0) r6
                r0 = 0
                if (r6 != 0) goto Ld
                java.lang.Double r5 = java.lang.Double.valueOf(r0)
                goto L2e
            Ld:
                if (r5 == 0) goto L19
                java.lang.Double r5 = p362uh.C6462h.m13048E(r5)
                if (r5 == 0) goto L19
                double r0 = r5.doubleValue()
            L19:
                r2 = 4636702106982547456(0x4058e00000000000, double:99.5)
                double r0 = r0 * r2
                r5 = 100
                double r2 = (double) r5
                double r0 = r0 / r2
                double r5 = r6.getMultiplayer()
                double r5 = r5 * r0
                java.lang.Double r5 = java.lang.Double.valueOf(r5)
            L2e:
                return r5
        }
    }

    public C3030a(android.app.Application r3, p238nd.C4728b0 r4, io.tacocrypto.app.database.AppDatabase r5) {
            r2 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r4 = "appDatabase"
            p214m2.C4339q.m9706k(r5, r4)
            r2.<init>()
            he.a$b r4 = new he.a$b
            r4.<init>(r3)
            ch.d r3 = p185k7.C4038x4.m9096i(r4)
            r2.f12197c = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r4.<init>()
            r2.f12198d = r4
            androidx.lifecycle.d0 r5 = new androidx.lifecycle.d0
            r5.<init>()
            androidx.lifecycle.d0 r5 = new androidx.lifecycle.d0
            r5.<init>()
            androidx.lifecycle.d0 r5 = new androidx.lifecycle.d0
            r5.<init>()
            androidx.lifecycle.d0 r0 = new androidx.lifecycle.d0
            r0.<init>()
            r2.f12199e = r0
            androidx.lifecycle.d0 r1 = new androidx.lifecycle.d0
            r1.<init>()
            r2.f12200f = r1
            he.a$c r1 = p131he.C3030a.c.f12203Z
            p185k7.C4038x4.m9090c(r0, r4, r1)
            he.a$a r4 = p131he.C3030a.a.f12201Z
            p185k7.C4038x4.m9090c(r3, r5, r4)
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            return
    }
}
