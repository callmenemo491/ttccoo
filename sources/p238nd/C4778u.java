package p238nd;

/* renamed from: nd.u */
/* loaded from: classes.dex */
public final class C4778u {

    /* renamed from: c */
    public static final p238nd.C4778u.a f19116c = null;

    /* renamed from: a */
    public final ch.InterfaceC0977d f19117a;

    /* renamed from: b */
    public java.lang.Long f19118b;

    /* renamed from: nd.u$a */
    public static final class a {
        public a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public final java.util.Calendar m10836a() {
                r1 = this;
                java.lang.String r0 = "UTC"
                java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
                java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
                return r0
        }
    }

    /* renamed from: nd.u$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.content.Context f19119Z;

        public b(android.content.Context r1) {
                r0 = this;
                r0.f19119Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.content.Context r0 = r1.f19119Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    static {
            nd.u$a r0 = new nd.u$a
            r1 = 0
            r0.<init>(r1)
            p238nd.C4778u.f19116c = r0
            return
    }

    public C4778u(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            nd.u$b r0 = new nd.u$b
            r0.<init>(r2)
            ch.d r2 = p185k7.C4038x4.m9096i(r0)
            r1.f19117a = r2
            return
    }

    /* renamed from: a */
    public final void m10833a() {
            r5 = this;
            java.lang.Long r0 = r5.f19118b
            if (r0 != 0) goto L1e
            h2.j r0 = new h2.j
            nd.s r1 = new nd.s
            r1.<init>(r5)
            nd.r r2 = p238nd.C4772r.f19094b
            r3 = 0
            java.lang.String r4 = "http://worldtimeapi.org/api/timezone/Etc/UTC"
            r0.<init>(r3, r4, r1, r2)
            ch.d r1 = r5.f19117a
            java.lang.Object r1 = r1.getValue()
            g2.o r1 = (p105g2.C2221o) r1
            r1.m5814a(r0)
        L1e:
            return
    }

    /* renamed from: b */
    public final java.lang.String m10834b() {
            r4 = this;
            nd.u$a r0 = p238nd.C4778u.f19116c
            java.util.Calendar r0 = r0.m10836a()
            long r0 = r0.getTimeInMillis()
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2
            long r0 = r0 / r2
            java.lang.Long r2 = r4.f19118b
            java.lang.String r3 = "currentPhone: "
            if (r2 != 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", rapportUnix is null"
            r2.append(r0)
            goto L3c
        L25:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", timeStamp is "
            r2.append(r0)
            long r0 = r4.m10835c()
            r2.append(r0)
        L3c:
            java.lang.String r0 = r2.toString()
            return r0
    }

    /* renamed from: c */
    public final long m10835c() {
            r9 = this;
            java.lang.Long r0 = r9.f19118b
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 == 0) goto L53
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = (long) r1
            long r2 = r2 / r0
            java.lang.Long r4 = r9.f19118b
            p214m2.C4339q.m9704i(r4)
            long r4 = r4.longValue()
            long r4 = r4 + r2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "result: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = ", systemClock: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = ", "
            r6.append(r2)
            nd.u$a r2 = p238nd.C4778u.f19116c
            java.util.Calendar r2 = r2.m10836a()
            long r7 = r2.getTimeInMillis()
            long r7 = r7 / r0
            r0 = 0
            r1 = 2
            java.lang.String r3 = "yyyy-MM-dd'T'hh:mm:ss zzz"
            java.lang.String r0 = vg.C6664e.m13504e(r2, r3, r0, r1)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            hk.a$b r2 = hk.C3053a.f12282b
            r2.mo7467a(r0, r1)
            goto L60
        L53:
            nd.u$a r0 = p238nd.C4778u.f19116c
            java.util.Calendar r0 = r0.m10836a()
            long r2 = r0.getTimeInMillis()
            long r0 = (long) r1
            long r4 = r2 / r0
        L60:
            return r4
    }
}
