package p265p1;

/* renamed from: p1.b */
/* loaded from: classes.dex */
public class C5343b implements p243o1.InterfaceC4873c {

    /* renamed from: Y */
    public final android.content.Context f21243Y;

    /* renamed from: Z */
    public final java.lang.String f21244Z;

    /* renamed from: a0 */
    public final p243o1.InterfaceC4873c.a f21245a0;

    /* renamed from: b0 */
    public final boolean f21246b0;

    /* renamed from: c0 */
    public final java.lang.Object f21247c0;

    /* renamed from: d0 */
    public p265p1.C5343b.a f21248d0;

    /* renamed from: e0 */
    public boolean f21249e0;

    /* renamed from: p1.b$a */
    public static class a extends android.database.sqlite.SQLiteOpenHelper {

        /* renamed from: Y */
        public final p265p1.C5342a[] f21250Y;

        /* renamed from: Z */
        public final p243o1.InterfaceC4873c.a f21251Z;

        /* renamed from: a0 */
        public boolean f21252a0;

        /* renamed from: p1.b$a$a, reason: collision with other inner class name */
        public class C7413a implements android.database.DatabaseErrorHandler {

            /* renamed from: a */
            public final /* synthetic */ p243o1.InterfaceC4873c.a f21253a;

            /* renamed from: b */
            public final /* synthetic */ p265p1.C5342a[] f21254b;

            public C7413a(p243o1.InterfaceC4873c.a r1, p265p1.C5342a[] r2) {
                    r0 = this;
                    r0.f21253a = r1
                    r0.f21254b = r2
                    r0.<init>()
                    return
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
                    r3 = this;
                    o1.c$a r0 = r3.f21253a
                    p1.a[] r1 = r3.f21254b
                    p1.a r4 = p265p1.C5343b.a.m11650h(r1, r4)
                    java.util.Objects.requireNonNull(r0)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Corruption reported by sqlite on database: "
                    r1.append(r2)
                    java.lang.String r2 = r4.mo11006J()
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r2 = "SupportSQLite"
                    android.util.Log.e(r2, r1)
                    boolean r1 = r4.isOpen()
                    if (r1 != 0) goto L2c
                    goto L75
                L2c:
                    r1 = 0
                    java.util.List r1 = r4.mo11015p()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
                    goto L34
                L32:
                    r2 = move-exception
                    goto L38
                L34:
                    r4.close()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L5a
                    goto L5b
                L38:
                    if (r1 == 0) goto L52
                    java.util.Iterator r4 = r1.iterator()
                L3e:
                    boolean r1 = r4.hasNext()
                    if (r1 == 0) goto L59
                    java.lang.Object r1 = r4.next()
                    android.util.Pair r1 = (android.util.Pair) r1
                    java.lang.Object r1 = r1.second
                    java.lang.String r1 = (java.lang.String) r1
                    r0.m11021a(r1)
                    goto L3e
                L52:
                    java.lang.String r4 = r4.mo11006J()
                    r0.m11021a(r4)
                L59:
                    throw r2
                L5a:
                L5b:
                    if (r1 == 0) goto L75
                    java.util.Iterator r4 = r1.iterator()
                L61:
                    boolean r1 = r4.hasNext()
                    if (r1 == 0) goto L7c
                    java.lang.Object r1 = r4.next()
                    android.util.Pair r1 = (android.util.Pair) r1
                    java.lang.Object r1 = r1.second
                    java.lang.String r1 = (java.lang.String) r1
                    r0.m11021a(r1)
                    goto L61
                L75:
                    java.lang.String r4 = r4.mo11006J()
                    r0.m11021a(r4)
                L7c:
                    return
            }
        }

        public a(android.content.Context r7, java.lang.String r8, p265p1.C5342a[] r9, p243o1.InterfaceC4873c.a r10) {
                r6 = this;
                int r4 = r10.f19356a
                p1.b$a$a r5 = new p1.b$a$a
                r5.<init>(r10, r9)
                r3 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                r6.f21251Z = r10
                r6.f21250Y = r9
                return
        }

        /* renamed from: h */
        public static p265p1.C5342a m11650h(p265p1.C5342a[] r2, android.database.sqlite.SQLiteDatabase r3) {
                r0 = 0
                r1 = r2[r0]
                if (r1 == 0) goto Le
                android.database.sqlite.SQLiteDatabase r1 = r1.f21240Y
                if (r1 != r3) goto Lb
                r1 = 1
                goto Lc
            Lb:
                r1 = 0
            Lc:
                if (r1 != 0) goto L15
            Le:
                p1.a r1 = new p1.a
                r1.<init>(r3)
                r2[r0] = r1
            L15:
                r2 = r2[r0]
                return r2
        }

        /* renamed from: a */
        public p265p1.C5342a m11651a(android.database.sqlite.SQLiteDatabase r2) {
                r1 = this;
                p1.a[] r0 = r1.f21250Y
                p1.a r2 = m11650h(r0, r2)
                return r2
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
                r3 = this;
                monitor-enter(r3)
                super.close()     // Catch: java.lang.Throwable -> Lc
                p1.a[] r0 = r3.f21250Y     // Catch: java.lang.Throwable -> Lc
                r1 = 0
                r2 = 0
                r0[r1] = r2     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r3)
                return
            Lc:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
        }

        /* renamed from: i */
        public synchronized p243o1.InterfaceC4871a m11652i() {
                r2 = this;
                monitor-enter(r2)
                r0 = 0
                r2.f21252a0 = r0     // Catch: java.lang.Throwable -> L1b
                android.database.sqlite.SQLiteDatabase r0 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L1b
                boolean r1 = r2.f21252a0     // Catch: java.lang.Throwable -> L1b
                if (r1 == 0) goto L15
                r2.close()     // Catch: java.lang.Throwable -> L1b
                o1.a r0 = r2.m11652i()     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r2)
                return r0
            L15:
                p1.a r0 = r2.m11651a(r0)     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r2)
                return r0
            L1b:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(android.database.sqlite.SQLiteDatabase r3) {
                r2 = this;
                o1.c$a r0 = r2.f21251Z
                p1.a[] r1 = r2.f21250Y
                p1.a r3 = m11650h(r1, r3)
                r0.mo8119b(r3)
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(android.database.sqlite.SQLiteDatabase r3) {
                r2 = this;
                o1.c$a r0 = r2.f21251Z
                p1.a[] r1 = r2.f21250Y
                p1.a r3 = m11650h(r1, r3)
                r0.mo8120c(r3)
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(android.database.sqlite.SQLiteDatabase r3, int r4, int r5) {
                r2 = this;
                r0 = 1
                r2.f21252a0 = r0
                o1.c$a r0 = r2.f21251Z
                p1.a[] r1 = r2.f21250Y
                p1.a r3 = m11650h(r1, r3)
                r0.mo8121d(r3, r4, r5)
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(android.database.sqlite.SQLiteDatabase r3) {
                r2 = this;
                boolean r0 = r2.f21252a0
                if (r0 != 0) goto Lf
                o1.c$a r0 = r2.f21251Z
                p1.a[] r1 = r2.f21250Y
                p1.a r3 = m11650h(r1, r3)
                r0.mo8122e(r3)
            Lf:
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(android.database.sqlite.SQLiteDatabase r3, int r4, int r5) {
                r2 = this;
                r0 = 1
                r2.f21252a0 = r0
                o1.c$a r0 = r2.f21251Z
                p1.a[] r1 = r2.f21250Y
                p1.a r3 = m11650h(r1, r3)
                r0.mo8123f(r3, r4, r5)
                return
        }
    }

    public C5343b(android.content.Context r1, java.lang.String r2, p243o1.InterfaceC4873c.a r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f21243Y = r1
            r0.f21244Z = r2
            r0.f21245a0 = r3
            r0.f21246b0 = r4
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f21247c0 = r1
            return
    }

    /* renamed from: a */
    public final p265p1.C5343b.a m11649a() {
            r6 = this;
            java.lang.Object r0 = r6.f21247c0
            monitor-enter(r0)
            p1.b$a r1 = r6.f21248d0     // Catch: java.lang.Throwable -> L4d
            if (r1 != 0) goto L49
            r1 = 1
            p1.a[] r1 = new p265p1.C5342a[r1]     // Catch: java.lang.Throwable -> L4d
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L4d
            r3 = 23
            if (r2 < r3) goto L35
            java.lang.String r2 = r6.f21244Z     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L35
            boolean r2 = r6.f21246b0     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L35
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L4d
            android.content.Context r3 = r6.f21243Y     // Catch: java.lang.Throwable -> L4d
            java.io.File r3 = r3.getNoBackupFilesDir()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = r6.f21244Z     // Catch: java.lang.Throwable -> L4d
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L4d
            p1.b$a r3 = new p1.b$a     // Catch: java.lang.Throwable -> L4d
            android.content.Context r4 = r6.f21243Y     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L4d
            o1.c$a r5 = r6.f21245a0     // Catch: java.lang.Throwable -> L4d
            r3.<init>(r4, r2, r1, r5)     // Catch: java.lang.Throwable -> L4d
            r6.f21248d0 = r3     // Catch: java.lang.Throwable -> L4d
            goto L42
        L35:
            p1.b$a r2 = new p1.b$a     // Catch: java.lang.Throwable -> L4d
            android.content.Context r3 = r6.f21243Y     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = r6.f21244Z     // Catch: java.lang.Throwable -> L4d
            o1.c$a r5 = r6.f21245a0     // Catch: java.lang.Throwable -> L4d
            r2.<init>(r3, r4, r1, r5)     // Catch: java.lang.Throwable -> L4d
            r6.f21248d0 = r2     // Catch: java.lang.Throwable -> L4d
        L42:
            p1.b$a r1 = r6.f21248d0     // Catch: java.lang.Throwable -> L4d
            boolean r2 = r6.f21249e0     // Catch: java.lang.Throwable -> L4d
            r1.setWriteAheadLoggingEnabled(r2)     // Catch: java.lang.Throwable -> L4d
        L49:
            p1.b$a r1 = r6.f21248d0     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            return r1
        L4d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            throw r1
    }

    @Override // p243o1.InterfaceC4873c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            p1.b$a r0 = r1.m11649a()
            r0.close()
            return
    }

    @Override // p243o1.InterfaceC4873c
    public java.lang.String getDatabaseName() {
            r1 = this;
            java.lang.String r0 = r1.f21244Z
            return r0
    }

    @Override // p243o1.InterfaceC4873c
    /* renamed from: o0 */
    public p243o1.InterfaceC4871a mo8083o0() {
            r1 = this;
            p1.b$a r0 = r1.m11649a()
            o1.a r0 = r0.m11652i()
            return r0
    }

    @Override // p243o1.InterfaceC4873c
    public void setWriteAheadLoggingEnabled(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.f21247c0
            monitor-enter(r0)
            p1.b$a r1 = r2.f21248d0     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto La
            r1.setWriteAheadLoggingEnabled(r3)     // Catch: java.lang.Throwable -> Le
        La:
            r2.f21249e0 = r3     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
    }
}
