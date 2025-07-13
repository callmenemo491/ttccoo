package p222mb;

/* renamed from: mb.l */
/* loaded from: classes.dex */
public final class C4521l extends p169jb.AbstractC3483z<java.sql.Time> {

    /* renamed from: b */
    public static final p169jb.InterfaceC3458a0 f18360b = null;

    /* renamed from: a */
    public final java.text.DateFormat f18361a;

    /* renamed from: mb.l$a */
    public class a implements p169jb.InterfaceC3458a0 {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p169jb.InterfaceC3458a0
        /* renamed from: a */
        public <T> p169jb.AbstractC3483z<T> mo7921a(p169jb.C3467j r1, p274pb.C5380a<T> r2) {
                r0 = this;
                java.lang.Class<? super T> r1 = r2.f21381a
                java.lang.Class<java.sql.Time> r2 = java.sql.Time.class
                if (r1 != r2) goto Lc
                mb.l r1 = new mb.l
                r1.<init>()
                goto Ld
            Lc:
                r1 = 0
            Ld:
                return r1
        }
    }

    static {
            mb.l$a r0 = new mb.l$a
            r0.<init>()
            p222mb.C4521l.f18360b = r0
            return
    }

    public C4521l() {
            r2 = this;
            r2.<init>()
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "hh:mm:ss a"
            r0.<init>(r1)
            r2.f18361a = r0
            return
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: a */
    public java.sql.Time mo7919a(p290qb.C5612a r4) {
            r3 = this;
            monitor-enter(r3)
            qb.b r0 = r4.mo10414z0()     // Catch: java.lang.Throwable -> L2c
            qb.b r1 = p290qb.EnumC5613b.f21798g0     // Catch: java.lang.Throwable -> L2c
            if (r0 != r1) goto Lf
            r4.mo10411m0()     // Catch: java.lang.Throwable -> L2c
            r4 = 0
            monitor-exit(r3)
            goto L24
        Lf:
            java.text.DateFormat r0 = r3.f18361a     // Catch: java.text.ParseException -> L25 java.lang.Throwable -> L2c
            java.lang.String r4 = r4.mo10413x0()     // Catch: java.text.ParseException -> L25 java.lang.Throwable -> L2c
            java.util.Date r4 = r0.parse(r4)     // Catch: java.text.ParseException -> L25 java.lang.Throwable -> L2c
            java.sql.Time r0 = new java.sql.Time     // Catch: java.text.ParseException -> L25 java.lang.Throwable -> L2c
            long r1 = r4.getTime()     // Catch: java.text.ParseException -> L25 java.lang.Throwable -> L2c
            r0.<init>(r1)     // Catch: java.text.ParseException -> L25 java.lang.Throwable -> L2c
            monitor-exit(r3)
            r4 = r0
        L24:
            return r4
        L25:
            r4 = move-exception
            jb.w r0 = new jb.w     // Catch: java.lang.Throwable -> L2c
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2c
            throw r0     // Catch: java.lang.Throwable -> L2c
        L2c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: b */
    public void mo7920b(p290qb.C5614c r2, java.sql.Time r3) {
            r1 = this;
            java.sql.Time r3 = (java.sql.Time) r3
            monitor-enter(r1)
            if (r3 != 0) goto L7
            r3 = 0
            goto Ld
        L7:
            java.text.DateFormat r0 = r1.f18361a     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = r0.format(r3)     // Catch: java.lang.Throwable -> L12
        Ld:
            r2.mo10423m0(r3)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
