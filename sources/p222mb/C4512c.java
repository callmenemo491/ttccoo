package p222mb;

/* renamed from: mb.c */
/* loaded from: classes.dex */
public final class C4512c extends p169jb.AbstractC3483z<java.util.Date> {

    /* renamed from: b */
    public static final p169jb.InterfaceC3458a0 f18321b = null;

    /* renamed from: a */
    public final java.util.List<java.text.DateFormat> f18322a;

    /* renamed from: mb.c$a */
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
                java.lang.Class<java.util.Date> r2 = java.util.Date.class
                if (r1 != r2) goto Lc
                mb.c r1 = new mb.c
                r1.<init>()
                goto Ld
            Lc:
                r1 = 0
            Ld:
                return r1
        }
    }

    static {
            mb.c$a r0 = new mb.c$a
            r0.<init>()
            p222mb.C4512c.f18321b = r0
            return
    }

    public C4512c() {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f18322a = r0
            java.util.Locale r1 = java.util.Locale.US
            r2 = 2
            java.text.DateFormat r3 = java.text.DateFormat.getDateTimeInstance(r2, r2, r1)
            r0.add(r3)
            java.util.Locale r3 = java.util.Locale.getDefault()
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L25
            java.text.DateFormat r1 = java.text.DateFormat.getDateTimeInstance(r2, r2)
            r0.add(r1)
        L25:
            int r1 = lb.C4253p.f17434a
            r3 = 9
            if (r1 < r3) goto L2d
            r1 = 1
            goto L2e
        L2d:
            r1 = 0
        L2e:
            if (r1 == 0) goto L37
            java.text.DateFormat r1 = p185k7.C3836i.m8623h(r2, r2)
            r0.add(r1)
        L37:
            return
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: a */
    public java.util.Date mo7919a(p290qb.C5612a r3) {
            r2 = this;
            qb.b r0 = r3.mo10414z0()
            qb.b r1 = p290qb.EnumC5613b.f21798g0
            if (r0 != r1) goto Ld
            r3.mo10411m0()
            r3 = 0
            goto L34
        Ld:
            java.lang.String r3 = r3.mo10413x0()
            monitor-enter(r2)
            java.util.List<java.text.DateFormat> r0 = r2.f18322a     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3c
        L18:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3c
            java.text.DateFormat r1 = (java.text.DateFormat) r1     // Catch: java.lang.Throwable -> L3c
            java.util.Date r3 = r1.parse(r3)     // Catch: java.text.ParseException -> L18 java.lang.Throwable -> L3c
            goto L33
        L29:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch: java.text.ParseException -> L35 java.lang.Throwable -> L3c
            r1 = 0
            r0.<init>(r1)     // Catch: java.text.ParseException -> L35 java.lang.Throwable -> L3c
            java.util.Date r3 = p237nb.C4722a.m10779b(r3, r0)     // Catch: java.text.ParseException -> L35 java.lang.Throwable -> L3c
        L33:
            monitor-exit(r2)
        L34:
            return r3
        L35:
            r0 = move-exception
            jb.w r1 = new jb.w     // Catch: java.lang.Throwable -> L3c
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L3c
            throw r1     // Catch: java.lang.Throwable -> L3c
        L3c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: b */
    public void mo7920b(p290qb.C5614c r3, java.util.Date r4) {
            r2 = this;
            java.util.Date r4 = (java.util.Date) r4
            monitor-enter(r2)
            if (r4 != 0) goto La
            r3.mo10417R()     // Catch: java.lang.Throwable -> L1c
        L8:
            monitor-exit(r2)
            goto L1b
        La:
            java.util.List<java.text.DateFormat> r0 = r2.f18322a     // Catch: java.lang.Throwable -> L1c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1c
            java.text.DateFormat r0 = (java.text.DateFormat) r0     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = r0.format(r4)     // Catch: java.lang.Throwable -> L1c
            r3.mo10423m0(r4)     // Catch: java.lang.Throwable -> L1c
            goto L8
        L1b:
            return
        L1c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
