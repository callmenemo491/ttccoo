package p169jb;

/* renamed from: jb.a */
/* loaded from: classes.dex */
public final class C3457a extends p169jb.AbstractC3483z<java.util.Date> {

    /* renamed from: a */
    public final java.lang.Class<? extends java.util.Date> f14933a;

    /* renamed from: b */
    public final java.util.List<java.text.DateFormat> f14934b;

    public C3457a(java.lang.Class<? extends java.util.Date> r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f14934b = r0
            m7918c(r3)
            r2.f14933a = r3
            java.util.Locale r3 = java.util.Locale.US
            java.text.DateFormat r1 = java.text.DateFormat.getDateTimeInstance(r4, r5, r3)
            r0.add(r1)
            java.util.Locale r1 = java.util.Locale.getDefault()
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L29
            java.text.DateFormat r3 = java.text.DateFormat.getDateTimeInstance(r4, r5)
            r0.add(r3)
        L29:
            int r3 = lb.C4253p.f17434a
            r1 = 9
            if (r3 < r1) goto L31
            r3 = 1
            goto L32
        L31:
            r3 = 0
        L32:
            if (r3 == 0) goto L3b
            java.text.DateFormat r3 = p185k7.C3836i.m8623h(r4, r5)
            r0.add(r3)
        L3b:
            return
    }

    public C3457a(java.lang.Class<? extends java.util.Date> r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f14934b = r0
            m7918c(r3)
            r2.f14933a = r3
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.US
            r3.<init>(r4, r1)
            r0.add(r3)
            java.util.Locale r3 = java.util.Locale.getDefault()
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L2b
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            r3.<init>(r4)
            r0.add(r3)
        L2b:
            return
    }

    /* renamed from: c */
    public static java.lang.Class<? extends java.util.Date> m7918c(java.lang.Class<? extends java.util.Date> r3) {
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            if (r3 == r0) goto L42
            java.lang.Class<java.sql.Date> r0 = java.sql.Date.class
            if (r3 == r0) goto L42
            java.lang.Class<java.sql.Timestamp> r0 = java.sql.Timestamp.class
            if (r3 != r0) goto Ld
            goto L42
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Date type must be one of "
            r1.append(r2)
            java.lang.Class<java.util.Date> r2 = java.util.Date.class
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            java.lang.Class<java.sql.Timestamp> r2 = java.sql.Timestamp.class
            r1.append(r2)
            java.lang.String r2 = ", or "
            r1.append(r2)
            java.lang.Class<java.sql.Date> r2 = java.sql.Date.class
            r1.append(r2)
            java.lang.String r2 = " but was "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L42:
            return r3
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: a */
    public java.util.Date mo7919a(p290qb.C5612a r4) {
            r3 = this;
            qb.b r0 = r4.mo10414z0()
            qb.b r1 = p290qb.EnumC5613b.f21798g0
            if (r0 != r1) goto Ld
            r4.mo10411m0()
            r4 = 0
            goto L5a
        Ld:
            java.lang.String r4 = r4.mo10413x0()
            java.util.List<java.text.DateFormat> r0 = r3.f14934b
            monitor-enter(r0)
            java.util.List<java.text.DateFormat> r1 = r3.f14934b     // Catch: java.lang.Throwable -> L68
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L68
        L1a:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L68
            java.text.DateFormat r2 = (java.text.DateFormat) r2     // Catch: java.lang.Throwable -> L68
            java.util.Date r4 = r2.parse(r4)     // Catch: java.text.ParseException -> L1a java.lang.Throwable -> L68
            goto L35
        L2b:
            java.text.ParsePosition r1 = new java.text.ParsePosition     // Catch: java.text.ParseException -> L61 java.lang.Throwable -> L68
            r2 = 0
            r1.<init>(r2)     // Catch: java.text.ParseException -> L61 java.lang.Throwable -> L68
            java.util.Date r4 = p237nb.C4722a.m10779b(r4, r1)     // Catch: java.text.ParseException -> L61 java.lang.Throwable -> L68
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.Class<? extends java.util.Date> r0 = r3.f14933a
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            if (r0 != r1) goto L3d
            goto L5a
        L3d:
            java.lang.Class<java.sql.Timestamp> r1 = java.sql.Timestamp.class
            if (r0 != r1) goto L4c
            java.sql.Timestamp r0 = new java.sql.Timestamp
            long r1 = r4.getTime()
            r0.<init>(r1)
        L4a:
            r4 = r0
            goto L5a
        L4c:
            java.lang.Class<java.sql.Date> r1 = java.sql.Date.class
            if (r0 != r1) goto L5b
            java.sql.Date r0 = new java.sql.Date
            long r1 = r4.getTime()
            r0.<init>(r1)
            goto L4a
        L5a:
            return r4
        L5b:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L61:
            r1 = move-exception
            jb.w r2 = new jb.w     // Catch: java.lang.Throwable -> L68
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L68
            throw r2     // Catch: java.lang.Throwable -> L68
        L68:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            throw r4
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: b */
    public void mo7920b(p290qb.C5614c r4, java.util.Date r5) {
            r3 = this;
            java.util.Date r5 = (java.util.Date) r5
            if (r5 != 0) goto L8
            r4.mo10417R()
            goto L1c
        L8:
            java.util.List<java.text.DateFormat> r0 = r3.f14934b
            monitor-enter(r0)
            java.util.List<java.text.DateFormat> r1 = r3.f14934b     // Catch: java.lang.Throwable -> L1d
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1d
            java.text.DateFormat r1 = (java.text.DateFormat) r1     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = r1.format(r5)     // Catch: java.lang.Throwable -> L1d
            r4.mo10423m0(r5)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
        L1c:
            return
        L1d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r4
    }

    public java.lang.String toString() {
            r4 = this;
            java.util.List<java.text.DateFormat> r0 = r4.f14934b
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            boolean r1 = r0 instanceof java.text.SimpleDateFormat
            r2 = 41
            java.lang.String r3 = "DefaultDateTypeAdapter("
            if (r1 == 0) goto L1c
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r3)
            java.text.SimpleDateFormat r0 = (java.text.SimpleDateFormat) r0
            java.lang.String r0 = r0.toPattern()
            goto L28
        L1c:
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r3)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
        L28:
            java.lang.String r0 = p185k7.C3814g5.m8552a(r1, r0, r2)
            return r0
    }
}
