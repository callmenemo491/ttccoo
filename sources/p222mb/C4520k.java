package p222mb;

/* renamed from: mb.k */
/* loaded from: classes.dex */
public final class C4520k extends p169jb.AbstractC3483z<java.sql.Date> {

    /* renamed from: b */
    public static final p169jb.InterfaceC3458a0 f18358b = null;

    /* renamed from: a */
    public final java.text.DateFormat f18359a;

    /* renamed from: mb.k$a */
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
                java.lang.Class<java.sql.Date> r2 = java.sql.Date.class
                if (r1 != r2) goto Lc
                mb.k r1 = new mb.k
                r1.<init>()
                goto Ld
            Lc:
                r1 = 0
            Ld:
                return r1
        }
    }

    static {
            mb.k$a r0 = new mb.k$a
            r0.<init>()
            p222mb.C4520k.f18358b = r0
            return
    }

    public C4520k() {
            r2 = this;
            r2.<init>()
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "MMM d, yyyy"
            r0.<init>(r1)
            r2.f18359a = r0
            return
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: a */
    public java.sql.Date mo7919a(p290qb.C5612a r3) {
            r2 = this;
            monitor-enter(r2)
            qb.b r0 = r3.mo10414z0()     // Catch: java.lang.Throwable -> L2b
            qb.b r1 = p290qb.EnumC5613b.f21798g0     // Catch: java.lang.Throwable -> L2b
            if (r0 != r1) goto Lf
            r3.mo10411m0()     // Catch: java.lang.Throwable -> L2b
            r3 = 0
        Ld:
            monitor-exit(r2)
            goto L23
        Lf:
            java.text.DateFormat r0 = r2.f18359a     // Catch: java.text.ParseException -> L24 java.lang.Throwable -> L2b
            java.lang.String r3 = r3.mo10413x0()     // Catch: java.text.ParseException -> L24 java.lang.Throwable -> L2b
            java.util.Date r3 = r0.parse(r3)     // Catch: java.text.ParseException -> L24 java.lang.Throwable -> L2b
            long r0 = r3.getTime()     // Catch: java.text.ParseException -> L24 java.lang.Throwable -> L2b
            java.sql.Date r3 = new java.sql.Date     // Catch: java.text.ParseException -> L24 java.lang.Throwable -> L2b
            r3.<init>(r0)     // Catch: java.text.ParseException -> L24 java.lang.Throwable -> L2b
            goto Ld
        L23:
            return r3
        L24:
            r3 = move-exception
            jb.w r0 = new jb.w     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L2b
            throw r0     // Catch: java.lang.Throwable -> L2b
        L2b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: b */
    public void mo7920b(p290qb.C5614c r2, java.sql.Date r3) {
            r1 = this;
            java.sql.Date r3 = (java.sql.Date) r3
            monitor-enter(r1)
            if (r3 != 0) goto L7
            r3 = 0
            goto Ld
        L7:
            java.text.DateFormat r0 = r1.f18359a     // Catch: java.lang.Throwable -> L12
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
