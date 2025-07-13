package p021b4;

/* renamed from: b4.k */
/* loaded from: classes.dex */
public class C0674k implements p021b4.InterfaceC0666c, p034c4.InterfaceC0867b {

    /* renamed from: c0 */
    public static final p335t3.C6149b f3843c0 = null;

    /* renamed from: Y */
    public final p021b4.C0679p f3844Y;

    /* renamed from: Z */
    public final p050d4.InterfaceC1277a f3845Z;

    /* renamed from: a0 */
    public final p050d4.InterfaceC1277a f3846a0;

    /* renamed from: b0 */
    public final p021b4.AbstractC0667d f3847b0;

    /* renamed from: b4.k$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: b4.k$b */
    public interface b<T, U> {
        U apply(T r1);
    }

    /* renamed from: b4.k$c */
    public static class c {

        /* renamed from: a */
        public final java.lang.String f3848a;

        /* renamed from: b */
        public final java.lang.String f3849b;

        public c(java.lang.String r1, java.lang.String r2, p021b4.C0674k.a r3) {
                r0 = this;
                r0.<init>()
                r0.f3848a = r1
                r0.f3849b = r2
                return
        }
    }

    /* renamed from: b4.k$d */
    public interface d<T> {
    }

    static {
            t3.b r0 = new t3.b
            java.lang.String r1 = "proto"
            r0.<init>(r1)
            p021b4.C0674k.f3843c0 = r0
            return
    }

    public C0674k(p050d4.InterfaceC1277a r1, p050d4.InterfaceC1277a r2, p021b4.AbstractC0667d r3, p021b4.C0679p r4) {
            r0 = this;
            r0.<init>()
            r0.f3844Y = r4
            r0.f3845Z = r1
            r0.f3846a0 = r2
            r0.f3847b0 = r3
            return
    }

    /* renamed from: A */
    public static java.lang.String m2233A(java.lang.Iterable<p021b4.AbstractC0671h> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r3.next()
            b4.h r1 = (p021b4.AbstractC0671h) r1
            long r1 = r1.mo2222b()
            r0.append(r1)
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto Lb
            r1 = 44
            r0.append(r1)
            goto Lb
        L2a:
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* renamed from: L */
    public static <T> T m2234L(android.database.Cursor r0, p021b4.C0674k.b<android.database.Cursor, T> r1) {
            java.lang.Object r1 = r1.apply(r0)     // Catch: java.lang.Throwable -> L8
            r0.close()
            return r1
        L8:
            r1 = move-exception
            r0.close()
            throw r1
    }

    @Override // p021b4.InterfaceC0666c
    /* renamed from: E */
    public boolean mo2224E(p385w3.AbstractC6787i r3) {
            r2 = this;
            b4.i r0 = new b4.i
            r1 = 0
            r0.<init>(r2, r3, r1)
            java.lang.Object r3 = r2.m2238l(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
    }

    @Override // p021b4.InterfaceC0666c
    /* renamed from: H */
    public long mo2225H(p385w3.AbstractC6787i r5) {
            r4 = this;
            android.database.sqlite.SQLiteDatabase r0 = r4.m2236h()
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = r5.mo13798b()
            r3 = 0
            r1[r3] = r2
            t3.d r5 = r5.mo13800d()
            int r5 = p069e4.C1515a.m4103a(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r2 = 1
            r1[r2] = r5
            java.lang.String r5 = "SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?"
            android.database.Cursor r5 = r0.rawQuery(r5, r1)
            k1.d r0 = p179k1.C3646d.f16113b0
            java.lang.Object r5 = m2234L(r5, r0)
            java.lang.Long r5 = (java.lang.Long) r5
            long r0 = r5.longValue()
            return r0
    }

    @Override // p021b4.InterfaceC0666c
    /* renamed from: N */
    public java.lang.Iterable<p385w3.AbstractC6787i> mo2226N() {
            r1 = this;
            k1.b r0 = p179k1.C3642b.f16052a0
            java.lang.Object r0 = r1.m2238l(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            return r0
    }

    @Override // p034c4.InterfaceC0867b
    /* renamed from: a */
    public <T> T mo2235a(p034c4.InterfaceC0867b.a<T> r4) {
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = r3.m2236h()
            u3.b r1 = new u3.b
            r1.<init>(r0)
            k1.c r2 = p179k1.C3644c.f16080b0
            r3.m2239n(r1, r2)
            java.lang.Object r4 = r4.mo23h()     // Catch: java.lang.Throwable -> L19
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L19
            r0.endTransaction()
            return r4
        L19:
            r4 = move-exception
            r0.endTransaction()
            throw r4
    }

    @Override // p021b4.InterfaceC0666c
    /* renamed from: a0 */
    public p021b4.AbstractC0671h mo2227a0(p385w3.AbstractC6787i r6, p385w3.AbstractC6784f r7) {
            r5 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            t3.d r1 = r6.mo13800d()
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r7.mo13790g()
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r6.mo13798b()
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "SQLiteEventStore"
            java.lang.String r2 = "Storing event with priority=%s, name=%s for destination %s"
            p064e.C1494h.m4053d(r1, r2, r0)
            z3.a r0 = new z3.a
            r0.<init>(r5, r6, r7)
            java.lang.Object r0 = r5.m2238l(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L36
            r6 = 0
            return r6
        L36:
            b4.b r2 = new b4.b
            r2.<init>(r0, r6, r7)
            return r2
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            b4.p r0 = r1.f3844Y
            r0.close()
            return
    }

    /* renamed from: h */
    public android.database.sqlite.SQLiteDatabase m2236h() {
            r2 = this;
            b4.p r0 = r2.f3844Y
            java.util.Objects.requireNonNull(r0)
            u3.b r1 = new u3.b
            r1.<init>(r0)
            androidx.room.a r0 = androidx.room.C0618a.f3652b0
            java.lang.Object r0 = r2.m2239n(r1, r0)
            android.database.sqlite.SQLiteDatabase r0 = (android.database.sqlite.SQLiteDatabase) r0
            return r0
    }

    @Override // p021b4.InterfaceC0666c
    /* renamed from: h0 */
    public void mo2228h0(java.lang.Iterable<p021b4.AbstractC0671h> r2) {
            r1 = this;
            java.util.Iterator r0 = r2.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.String r0 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r2 = m2233A(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            android.database.sqlite.SQLiteDatabase r0 = r1.m2236h()
            r0.beginTransaction()
            android.database.sqlite.SQLiteStatement r2 = r0.compileStatement(r2)     // Catch: java.lang.Throwable -> L3a
            r2.execute()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "DELETE FROM events WHERE num_attempts >= 16"
            android.database.sqlite.SQLiteStatement r2 = r0.compileStatement(r2)     // Catch: java.lang.Throwable -> L3a
            r2.execute()     // Catch: java.lang.Throwable -> L3a
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L3a
            r0.endTransaction()
            return
        L3a:
            r2 = move-exception
            r0.endTransaction()
            throw r2
    }

    /* renamed from: i */
    public final java.lang.Long m2237i(android.database.sqlite.SQLiteDatabase r14, p385w3.AbstractC6787i r15) {
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "backend_name = ? and priority = ?"
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r3 = r15.mo13798b()
            r4 = 0
            r2[r4] = r3
            t3.d r3 = r15.mo13800d()
            int r3 = p069e4.C1515a.m4103a(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r5 = 1
            r2[r5] = r3
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            byte[] r2 = r15.mo13799c()
            if (r2 == 0) goto L40
            java.lang.String r2 = " and extras = ?"
            r0.append(r2)
            byte[] r15 = r15.mo13799c()
            java.lang.String r15 = android.util.Base64.encodeToString(r15, r4)
            r1.add(r15)
            goto L45
        L40:
            java.lang.String r15 = " and extras is null"
            r0.append(r15)
        L45:
            java.lang.String r15 = "_id"
            java.lang.String[] r7 = new java.lang.String[]{r15}
            java.lang.String r8 = r0.toString()
            java.lang.String[] r15 = new java.lang.String[r4]
            java.lang.Object[] r15 = r1.toArray(r15)
            r9 = r15
            java.lang.String[] r9 = (java.lang.String[]) r9
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.String r6 = "transport_contexts"
            r5 = r14
            android.database.Cursor r14 = r5.query(r6, r7, r8, r9, r10, r11, r12)
            androidx.room.a r15 = androidx.room.C0618a.f3653c0
            java.lang.Object r14 = m2234L(r14, r15)
            java.lang.Long r14 = (java.lang.Long) r14
            return r14
    }

    @Override // p021b4.InterfaceC0666c
    /* renamed from: j */
    public int mo2229j() {
            r4 = this;
            d4.a r0 = r4.f3845Z
            long r0 = r0.mo3736a()
            b4.d r2 = r4.f3847b0
            long r2 = r2.mo2217b()
            long r0 = r0 - r2
            android.database.sqlite.SQLiteDatabase r2 = r4.m2236h()
            r2.beginTransaction()
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L35
            r1 = 0
            r3[r1] = r0     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "events"
            java.lang.String r1 = "timestamp_ms < ?"
            int r0 = r2.delete(r0, r1, r3)     // Catch: java.lang.Throwable -> L35
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L35
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L35
            r2.endTransaction()
            int r0 = r0.intValue()
            return r0
        L35:
            r0 = move-exception
            r2.endTransaction()
            throw r0
    }

    @Override // p021b4.InterfaceC0666c
    /* renamed from: k */
    public void mo2230k(java.lang.Iterable<p021b4.AbstractC0671h> r2) {
            r1 = this;
            java.util.Iterator r0 = r2.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.String r0 = "DELETE FROM events WHERE _id in "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r2 = m2233A(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            android.database.sqlite.SQLiteDatabase r0 = r1.m2236h()
            android.database.sqlite.SQLiteStatement r2 = r0.compileStatement(r2)
            r2.execute()
            return
    }

    /* renamed from: l */
    public <T> T m2238l(p021b4.C0674k.b<android.database.sqlite.SQLiteDatabase, T> r2) {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.m2236h()
            r0.beginTransaction()
            java.lang.Object r2 = r2.apply(r0)     // Catch: java.lang.Throwable -> L12
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L12
            r0.endTransaction()
            return r2
        L12:
            r2 = move-exception
            r0.endTransaction()
            throw r2
    }

    /* renamed from: n */
    public final <T> T m2239n(p021b4.C0674k.d<T> r9, p021b4.C0674k.b<java.lang.Throwable, T> r10) {
            r8 = this;
            d4.a r0 = r8.f3846a0
            long r0 = r0.mo3736a()
        L6:
            r2 = r9
            u3.b r2 = (p350u3.C6293b) r2     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L21
            int r3 = r2.f24544Y     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L21
            switch(r3) {
                case 3: goto Lf;
                default: goto Le;
            }     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L21
        Le:
            goto L18
        Lf:
            java.lang.Object r2 = r2.f24545Z     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L21
            b4.p r2 = (p021b4.C0679p) r2     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L21
            android.database.sqlite.SQLiteDatabase r9 = r2.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L21
            goto L20
        L18:
            java.lang.Object r2 = r2.f24545Z     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L21
            android.database.sqlite.SQLiteDatabase r2 = (android.database.sqlite.SQLiteDatabase) r2     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L21
            r2.beginTransaction()     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L21
            r9 = 0
        L20:
            return r9
        L21:
            r2 = move-exception
            d4.a r3 = r8.f3846a0
            long r3 = r3.mo3736a()
            b4.d r5 = r8.f3847b0
            int r5 = r5.mo2216a()
            long r5 = (long) r5
            long r5 = r5 + r0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L39
            java.lang.Object r9 = r10.apply(r2)
            return r9
        L39:
            r2 = 50
            android.os.SystemClock.sleep(r2)
            goto L6
    }

    @Override // p021b4.InterfaceC0666c
    /* renamed from: o */
    public void mo2231o(p385w3.AbstractC6787i r2, long r3) {
            r1 = this;
            b4.j r0 = new b4.j
            r0.<init>(r3, r2)
            r1.m2238l(r0)
            return
    }

    @Override // p021b4.InterfaceC0666c
    /* renamed from: v0 */
    public java.lang.Iterable<p021b4.AbstractC0671h> mo2232v0(p385w3.AbstractC6787i r3) {
            r2 = this;
            b4.i r0 = new b4.i
            r1 = 1
            r0.<init>(r2, r3, r1)
            java.lang.Object r3 = r2.m2238l(r0)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            return r3
    }
}
