package p179k1;

/* renamed from: k1.t */
/* loaded from: classes.dex */
public class C3662t {

    /* renamed from: l */
    public static final java.lang.String[] f16160l = null;

    /* renamed from: a */
    public final java.util.HashMap<java.lang.String, java.lang.Integer> f16161a;

    /* renamed from: b */
    public final java.lang.String[] f16162b;

    /* renamed from: c */
    public java.util.Map<java.lang.String, java.util.Set<java.lang.String>> f16163c;

    /* renamed from: d */
    public final p179k1.AbstractC3664v f16164d;

    /* renamed from: e */
    public java.util.concurrent.atomic.AtomicBoolean f16165e;

    /* renamed from: f */
    public volatile boolean f16166f;

    /* renamed from: g */
    public volatile p243o1.InterfaceC4876f f16167g;

    /* renamed from: h */
    public p179k1.C3662t.b f16168h;

    /* renamed from: i */
    public final androidx.appcompat.widget.C0311x f16169i;

    /* renamed from: j */
    @android.annotation.SuppressLint({"RestrictedApi"})
    public final p226n.C4640b<p179k1.C3662t.c, p179k1.C3662t.d> f16170j;

    /* renamed from: k */
    public java.lang.Runnable f16171k;

    /* renamed from: k1.t$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ p179k1.C3662t f16172Y;

        public a(p179k1.C3662t r1) {
                r0 = this;
                r0.f16172Y = r1
                r0.<init>()
                return
        }

        /* renamed from: a */
        public final java.util.Set<java.lang.Integer> m8100a() {
                r4 = this;
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                k1.t r1 = r4.f16172Y
                k1.v r1 = r1.f16164d
                androidx.appcompat.widget.x r2 = new androidx.appcompat.widget.x
                java.lang.String r3 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"
                r2.<init>(r3)
                r3 = 0
                android.database.Cursor r1 = r1.m8115l(r2, r3)
            L15:
                boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L39
                if (r2 == 0) goto L28
                r2 = 0
                int r2 = r1.getInt(r2)     // Catch: java.lang.Throwable -> L39
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L39
                r0.add(r2)     // Catch: java.lang.Throwable -> L39
                goto L15
            L28:
                r1.close()
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L38
                k1.t r1 = r4.f16172Y
                o1.f r1 = r1.f16167g
                r1.mo11023x()
            L38:
                return r0
            L39:
                r0 = move-exception
                r1.close()
                throw r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r11 = this;
                k1.t r0 = r11.f16172Y
                k1.v r0 = r0.f16164d
                java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.f16195i
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
                r0.lock()
                r1 = 1
                r2 = 0
                r3 = 0
                k1.t r4 = r11.f16172Y     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteException -> L5e java.lang.IllegalStateException -> L60
                boolean r4 = r4.m8093c()     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteException -> L5e java.lang.IllegalStateException -> L60
                if (r4 != 0) goto L21
            L18:
                r0.unlock()
                k1.t r0 = r11.f16172Y
                java.util.Objects.requireNonNull(r0)
                return
            L21:
                k1.t r4 = r11.f16172Y     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteException -> L5e java.lang.IllegalStateException -> L60
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.f16165e     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteException -> L5e java.lang.IllegalStateException -> L60
                boolean r4 = r4.compareAndSet(r1, r2)     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteException -> L5e java.lang.IllegalStateException -> L60
                if (r4 != 0) goto L2c
                goto L18
            L2c:
                k1.t r4 = r11.f16172Y     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteException -> L5e java.lang.IllegalStateException -> L60
                k1.v r4 = r4.f16164d     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteException -> L5e java.lang.IllegalStateException -> L60
                boolean r4 = r4.m8111h()     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteException -> L5e java.lang.IllegalStateException -> L60
                if (r4 == 0) goto L37
                goto L18
            L37:
                k1.t r4 = r11.f16172Y     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteException -> L5e java.lang.IllegalStateException -> L60
                k1.v r4 = r4.f16164d     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteException -> L5e java.lang.IllegalStateException -> L60
                o1.c r4 = r4.f16190d     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteException -> L5e java.lang.IllegalStateException -> L60
                o1.a r4 = r4.mo8083o0()     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteException -> L5e java.lang.IllegalStateException -> L60
                r4.mo11011c0()     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteException -> L5e java.lang.IllegalStateException -> L60
                java.util.Set r5 = r11.m8100a()     // Catch: java.lang.Throwable -> L55
                r4.mo11010Y()     // Catch: java.lang.Throwable -> L53
                r4.mo11013f()     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.IllegalStateException -> L51 java.lang.Throwable -> L5b
                goto L69
            L4f:
                r4 = move-exception
                goto L62
            L51:
                r4 = move-exception
                goto L62
            L53:
                r6 = move-exception
                goto L57
            L55:
                r6 = move-exception
                r5 = r3
            L57:
                r4.mo11013f()     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.IllegalStateException -> L51 java.lang.Throwable -> L5b
                throw r6     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.IllegalStateException -> L51 java.lang.Throwable -> L5b
            L5b:
                r1 = move-exception
                goto Ld4
            L5e:
                r4 = move-exception
                goto L61
            L60:
                r4 = move-exception
            L61:
                r5 = r3
            L62:
                java.lang.String r6 = "ROOM"
                java.lang.String r7 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r6, r7, r4)     // Catch: java.lang.Throwable -> L5b
            L69:
                r0.unlock()
                k1.t r0 = r11.f16172Y
                java.util.Objects.requireNonNull(r0)
                if (r5 == 0) goto Ld3
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto Ld3
                k1.t r0 = r11.f16172Y
                n.b<k1.t$c, k1.t$d> r0 = r0.f16170j
                monitor-enter(r0)
                k1.t r4 = r11.f16172Y     // Catch: java.lang.Throwable -> Ld0
                n.b<k1.t$c, k1.t$d> r4 = r4.f16170j     // Catch: java.lang.Throwable -> Ld0
                java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Ld0
            L86:
                r6 = r4
                n.b$e r6 = (p226n.C4640b.e) r6     // Catch: java.lang.Throwable -> Ld0
                boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> Ld0
                if (r7 == 0) goto Lce
                java.lang.Object r6 = r6.next()     // Catch: java.lang.Throwable -> Ld0
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Throwable -> Ld0
                java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> Ld0
                k1.t$d r6 = (p179k1.C3662t.d) r6     // Catch: java.lang.Throwable -> Ld0
                int[] r7 = r6.f16179a     // Catch: java.lang.Throwable -> Ld0
                int r7 = r7.length     // Catch: java.lang.Throwable -> Ld0
                r9 = r3
                r8 = 0
            La0:
                if (r8 >= r7) goto Lc6
                int[] r10 = r6.f16179a     // Catch: java.lang.Throwable -> Ld0
                r10 = r10[r8]     // Catch: java.lang.Throwable -> Ld0
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> Ld0
                boolean r10 = r5.contains(r10)     // Catch: java.lang.Throwable -> Ld0
                if (r10 == 0) goto Lc3
                if (r7 != r1) goto Lb5
                java.util.Set<java.lang.String> r9 = r6.f16182d     // Catch: java.lang.Throwable -> Ld0
                goto Lc3
            Lb5:
                if (r9 != 0) goto Lbc
                java.util.HashSet r9 = new java.util.HashSet     // Catch: java.lang.Throwable -> Ld0
                r9.<init>(r7)     // Catch: java.lang.Throwable -> Ld0
            Lbc:
                java.lang.String[] r10 = r6.f16180b     // Catch: java.lang.Throwable -> Ld0
                r10 = r10[r8]     // Catch: java.lang.Throwable -> Ld0
                r9.add(r10)     // Catch: java.lang.Throwable -> Ld0
            Lc3:
                int r8 = r8 + 1
                goto La0
            Lc6:
                if (r9 == 0) goto L86
                k1.t$c r6 = r6.f16181c     // Catch: java.lang.Throwable -> Ld0
                r6.mo8102a(r9)     // Catch: java.lang.Throwable -> Ld0
                goto L86
            Lce:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld0
                goto Ld3
            Ld0:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld0
                throw r1
            Ld3:
                return
            Ld4:
                r0.unlock()
                k1.t r0 = r11.f16172Y
                java.util.Objects.requireNonNull(r0)
                throw r1
        }
    }

    /* renamed from: k1.t$b */
    public static class b {

        /* renamed from: a */
        public final long[] f16173a;

        /* renamed from: b */
        public final boolean[] f16174b;

        /* renamed from: c */
        public final int[] f16175c;

        /* renamed from: d */
        public boolean f16176d;

        /* renamed from: e */
        public boolean f16177e;

        public b(int r5) {
                r4 = this;
                r4.<init>()
                long[] r0 = new long[r5]
                r4.f16173a = r0
                boolean[] r1 = new boolean[r5]
                r4.f16174b = r1
                int[] r5 = new int[r5]
                r4.f16175c = r5
                r2 = 0
                java.util.Arrays.fill(r0, r2)
                r5 = 0
                java.util.Arrays.fill(r1, r5)
                return
        }

        /* renamed from: a */
        public int[] m8101a() {
                r9 = this;
                monitor-enter(r9)
                boolean r0 = r9.f16176d     // Catch: java.lang.Throwable -> L42
                if (r0 == 0) goto L3f
                boolean r0 = r9.f16177e     // Catch: java.lang.Throwable -> L42
                if (r0 == 0) goto La
                goto L3f
            La:
                long[] r0 = r9.f16173a     // Catch: java.lang.Throwable -> L42
                int r0 = r0.length     // Catch: java.lang.Throwable -> L42
                r1 = 0
                r2 = 0
            Lf:
                r3 = 1
                if (r2 >= r0) goto L37
                long[] r4 = r9.f16173a     // Catch: java.lang.Throwable -> L42
                r5 = r4[r2]     // Catch: java.lang.Throwable -> L42
                r7 = 0
                int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r4 <= 0) goto L1e
                r4 = 1
                goto L1f
            L1e:
                r4 = 0
            L1f:
                boolean[] r5 = r9.f16174b     // Catch: java.lang.Throwable -> L42
                boolean r6 = r5[r2]     // Catch: java.lang.Throwable -> L42
                if (r4 == r6) goto L2e
                int[] r6 = r9.f16175c     // Catch: java.lang.Throwable -> L42
                if (r4 == 0) goto L2a
                goto L2b
            L2a:
                r3 = 2
            L2b:
                r6[r2] = r3     // Catch: java.lang.Throwable -> L42
                goto L32
            L2e:
                int[] r3 = r9.f16175c     // Catch: java.lang.Throwable -> L42
                r3[r2] = r1     // Catch: java.lang.Throwable -> L42
            L32:
                r5[r2] = r4     // Catch: java.lang.Throwable -> L42
                int r2 = r2 + 1
                goto Lf
            L37:
                r9.f16177e = r3     // Catch: java.lang.Throwable -> L42
                r9.f16176d = r1     // Catch: java.lang.Throwable -> L42
                int[] r0 = r9.f16175c     // Catch: java.lang.Throwable -> L42
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L42
                return r0
            L3f:
                r0 = 0
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L42
                return r0
            L42:
                r0 = move-exception
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L42
                throw r0
        }
    }

    /* renamed from: k1.t$c */
    public static abstract class c {

        /* renamed from: a */
        public final java.lang.String[] f16178a;

        public c(java.lang.String[] r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.length
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
                java.lang.String[] r2 = (java.lang.String[]) r2
                r1.f16178a = r2
                return
        }

        /* renamed from: a */
        public abstract void mo8102a(java.util.Set<java.lang.String> r1);
    }

    /* renamed from: k1.t$d */
    public static class d {

        /* renamed from: a */
        public final int[] f16179a;

        /* renamed from: b */
        public final java.lang.String[] f16180b;

        /* renamed from: c */
        public final p179k1.C3662t.c f16181c;

        /* renamed from: d */
        public final java.util.Set<java.lang.String> f16182d;

        public d(p179k1.C3662t.c r1, int[] r2, java.lang.String[] r3) {
                r0 = this;
                r0.<init>()
                r0.f16181c = r1
                r0.f16179a = r2
                r0.f16180b = r3
                int r1 = r2.length
                r2 = 1
                if (r1 != r2) goto L1d
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                r2 = 0
                r2 = r3[r2]
                r1.add(r2)
                java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
                goto L1e
            L1d:
                r1 = 0
            L1e:
                r0.f16182d = r1
                return
        }
    }

    /* renamed from: k1.t$e */
    public static class e extends p179k1.C3662t.c {

        /* renamed from: b */
        public final p179k1.C3662t f16183b;

        /* renamed from: c */
        public final java.lang.ref.WeakReference<p179k1.C3662t.c> f16184c;

        public e(p179k1.C3662t r2, p179k1.C3662t.c r3) {
                r1 = this;
                java.lang.String[] r0 = r3.f16178a
                r1.<init>(r0)
                r1.f16183b = r2
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r3)
                r1.f16184c = r2
                return
        }

        @Override // p179k1.C3662t.c
        /* renamed from: a */
        public void mo8102a(java.util.Set<java.lang.String> r2) {
                r1 = this;
                java.lang.ref.WeakReference<k1.t$c> r0 = r1.f16184c
                java.lang.Object r0 = r0.get()
                k1.t$c r0 = (p179k1.C3662t.c) r0
                if (r0 != 0) goto L10
                k1.t r2 = r1.f16183b
                r2.m8094d(r1)
                goto L13
            L10:
                r0.mo8102a(r2)
            L13:
                return
        }
    }

    static {
            java.lang.String r0 = "UPDATE"
            java.lang.String r1 = "DELETE"
            java.lang.String r2 = "INSERT"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            p179k1.C3662t.f16160l = r0
            return
    }

    public C3662t(p179k1.AbstractC3664v r5, java.util.Map<java.lang.String, java.lang.String> r6, java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r7, java.lang.String... r8) {
            r4 = this;
            r4.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r4.f16165e = r0
            r4.f16166f = r1
            n.b r0 = new n.b
            r0.<init>()
            r4.f16170j = r0
            k1.t$a r0 = new k1.t$a
            r0.<init>(r4)
            r4.f16171k = r0
            r4.f16164d = r5
            k1.t$b r0 = new k1.t$b
            int r2 = r8.length
            r0.<init>(r2)
            r4.f16168h = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.f16161a = r0
            r4.f16163c = r7
            androidx.appcompat.widget.x r7 = new androidx.appcompat.widget.x
            r7.<init>(r5)
            r4.f16169i = r7
            int r5 = r8.length
            java.lang.String[] r7 = new java.lang.String[r5]
            r4.f16162b = r7
        L3a:
            if (r1 >= r5) goto L67
            r7 = r8[r1]
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r0)
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r4.f16161a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2.put(r7, r3)
            r2 = r8[r1]
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L60
            java.lang.String[] r7 = r4.f16162b
            java.lang.String r0 = r2.toLowerCase(r0)
            r7[r1] = r0
            goto L64
        L60:
            java.lang.String[] r0 = r4.f16162b
            r0[r1] = r7
        L64:
            int r1 = r1 + 1
            goto L3a
        L67:
            java.util.Set r5 = r6.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L6f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto La5
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getValue()
            java.lang.String r7 = (java.lang.String) r7
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r8)
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r4.f16161a
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L6f
            java.lang.Object r6 = r6.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.toLowerCase(r8)
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r4.f16161a
            java.lang.Object r7 = r8.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            r8.put(r6, r7)
            goto L6f
        La5:
            return
    }

    @android.annotation.SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public void m8091a(p179k1.C3662t.c r11) {
            r10 = this;
            java.lang.String[] r0 = r11.f16178a
            java.lang.String[] r0 = r10.m8095e(r0)
            int r1 = r0.length
            int[] r2 = new int[r1]
            int r3 = r0.length
            r4 = 0
            r5 = 0
        Lc:
            if (r5 >= r3) goto L3e
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r10.f16161a
            r7 = r0[r5]
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r8)
            java.lang.Object r6 = r6.get(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L29
            int r6 = r6.intValue()
            r2[r5] = r6
            int r5 = r5 + 1
            goto Lc
        L29:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "There is no table with name "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            r0 = r0[r5]
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.<init>(r0)
            throw r11
        L3e:
            k1.t$d r3 = new k1.t$d
            r3.<init>(r11, r2, r0)
            n.b<k1.t$c, k1.t$d> r0 = r10.f16170j
            monitor-enter(r0)
            n.b<k1.t$c, k1.t$d> r5 = r10.f16170j     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r11 = r5.mo10455i(r11, r3)     // Catch: java.lang.Throwable -> L7a
            k1.t$d r11 = (p179k1.C3662t.d) r11     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7a
            if (r11 != 0) goto L79
            k1.t$b r11 = r10.f16168h
            monitor-enter(r11)
            r0 = 0
        L55:
            if (r4 >= r1) goto L6f
            r3 = r2[r4]     // Catch: java.lang.Throwable -> L76
            long[] r5 = r11.f16173a     // Catch: java.lang.Throwable -> L76
            r6 = r5[r3]     // Catch: java.lang.Throwable -> L76
            r8 = 1
            long r8 = r8 + r6
            r5[r3] = r8     // Catch: java.lang.Throwable -> L76
            r8 = 0
            r3 = 1
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 != 0) goto L6c
            r11.f16176d = r3     // Catch: java.lang.Throwable -> L76
            r0 = 1
        L6c:
            int r4 = r4 + 1
            goto L55
        L6f:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L79
            r10.m8098h()
            goto L79
        L76:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L76
            throw r0
        L79:
            return
        L7a:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7a
            throw r11
    }

    /* renamed from: b */
    public <T> androidx.lifecycle.LiveData<T> m8092b(java.lang.String[] r7, boolean r8, java.util.concurrent.Callable<T> r9) {
            r6 = this;
            androidx.appcompat.widget.x r2 = r6.f16169i
            java.lang.String[] r5 = r6.m8095e(r7)
            int r7 = r5.length
            r0 = 0
        L8:
            if (r0 >= r7) goto L29
            r1 = r5[r0]
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r6.f16161a
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r4 = r1.toLowerCase(r4)
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L1d
            int r0 = r0 + 1
            goto L8
        L1d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "There is no table with name "
            java.lang.String r8 = p064e.C1493g.m4049a(r8, r1)
            r7.<init>(r8)
            throw r7
        L29:
            java.util.Objects.requireNonNull(r2)
            k1.y r7 = new k1.y
            java.lang.Object r0 = r2.f1482a0
            r1 = r0
            k1.v r1 = (p179k1.AbstractC3664v) r1
            r0 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r7
    }

    /* renamed from: c */
    public boolean m8093c() {
            r3 = this;
            k1.v r0 = r3.f16164d
            boolean r0 = r0.m8114k()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            boolean r0 = r3.f16166f
            if (r0 != 0) goto L15
            k1.v r0 = r3.f16164d
            o1.c r0 = r0.f16190d
            r0.mo8083o0()
        L15:
            boolean r0 = r3.f16166f
            if (r0 != 0) goto L21
            java.lang.String r0 = "ROOM"
            java.lang.String r2 = "database is not initialized even though it is open"
            android.util.Log.e(r0, r2)
            return r1
        L21:
            r0 = 1
            return r0
    }

    @android.annotation.SuppressLint({"RestrictedApi"})
    /* renamed from: d */
    public void m8094d(p179k1.C3662t.c r13) {
            r12 = this;
            n.b<k1.t$c, k1.t$d> r0 = r12.f16170j
            monitor-enter(r0)
            n.b<k1.t$c, k1.t$d> r1 = r12.f16170j     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r13 = r1.mo10456l(r13)     // Catch: java.lang.Throwable -> L3a
            k1.t$d r13 = (p179k1.C3662t.d) r13     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            if (r13 == 0) goto L39
            k1.t$b r0 = r12.f16168h
            int[] r13 = r13.f16179a
            monitor-enter(r0)
            int r1 = r13.length     // Catch: java.lang.Throwable -> L36
            r2 = 0
            r3 = 0
        L16:
            if (r2 >= r1) goto L2f
            r4 = r13[r2]     // Catch: java.lang.Throwable -> L36
            long[] r5 = r0.f16173a     // Catch: java.lang.Throwable -> L36
            r6 = r5[r4]     // Catch: java.lang.Throwable -> L36
            r8 = 1
            long r10 = r6 - r8
            r5[r4] = r10     // Catch: java.lang.Throwable -> L36
            r4 = 1
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 != 0) goto L2c
            r0.f16176d = r4     // Catch: java.lang.Throwable -> L36
            r3 = 1
        L2c:
            int r2 = r2 + 1
            goto L16
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L39
            r12.m8098h()
            goto L39
        L36:
            r13 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r13
        L39:
            return
        L3a:
            r13 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r13
    }

    /* renamed from: e */
    public final java.lang.String[] m8095e(java.lang.String[] r7) {
            r6 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r7.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L2b
            r3 = r7[r2]
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r4 = r3.toLowerCase(r4)
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r5 = r6.f16163c
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L25
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r3 = r6.f16163c
            java.lang.Object r3 = r3.get(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            r0.addAll(r3)
            goto L28
        L25:
            r0.add(r3)
        L28:
            int r2 = r2 + 1
            goto L7
        L2b:
            int r7 = r0.size()
            java.lang.String[] r7 = new java.lang.String[r7]
            java.lang.Object[] r7 = r0.toArray(r7)
            java.lang.String[] r7 = (java.lang.String[]) r7
            return r7
    }

    /* renamed from: f */
    public final void m8096f(p243o1.InterfaceC4871a r12, int r13) {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "INSERT OR IGNORE INTO room_table_modification_log VALUES("
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = ", 0)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.mo11018s(r0)
            java.lang.String[] r0 = r11.f16162b
            r0 = r0[r13]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String[] r2 = p179k1.C3662t.f16160l
            int r3 = r2.length
            r4 = 0
            r5 = 0
        L27:
            if (r5 >= r3) goto L7e
            r6 = r2[r5]
            r1.setLength(r4)
            java.lang.String r7 = "CREATE TEMP TRIGGER IF NOT EXISTS "
            r1.append(r7)
            java.lang.String r7 = "`"
            r1.append(r7)
            java.lang.String r8 = "room_table_modification_trigger_"
            r1.append(r8)
            java.lang.String r8 = "_"
            p179k1.C3661s.m8090a(r1, r0, r8, r6, r7)
            java.lang.String r7 = " AFTER "
            java.lang.String r8 = " ON `"
            p179k1.C3661s.m8090a(r1, r7, r6, r8, r0)
            java.lang.String r6 = "` BEGIN UPDATE "
            java.lang.String r7 = "room_table_modification_log"
            java.lang.String r8 = " SET "
            java.lang.String r9 = "invalidated"
            p179k1.C3661s.m8090a(r1, r6, r7, r8, r9)
            java.lang.String r6 = " = 1"
            java.lang.String r7 = " WHERE "
            java.lang.String r8 = "table_id"
            java.lang.String r10 = " = "
            p179k1.C3661s.m8090a(r1, r6, r7, r8, r10)
            r1.append(r13)
            java.lang.String r6 = " AND "
            r1.append(r6)
            r1.append(r9)
            java.lang.String r6 = " = 0"
            r1.append(r6)
            java.lang.String r6 = "; END"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r12.mo11018s(r6)
            int r5 = r5 + 1
            goto L27
        L7e:
            return
    }

    /* renamed from: g */
    public final void m8097g(p243o1.InterfaceC4871a r9, int r10) {
            r8 = this;
            java.lang.String[] r0 = r8.f16162b
            r10 = r0[r10]
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String[] r1 = p179k1.C3662t.f16160l
            int r2 = r1.length
            r3 = 0
            r4 = 0
        Le:
            if (r4 >= r2) goto L3c
            r5 = r1[r4]
            r0.setLength(r3)
            java.lang.String r6 = "DROP TRIGGER IF EXISTS "
            r0.append(r6)
            java.lang.String r6 = "`"
            r0.append(r6)
            java.lang.String r7 = "room_table_modification_trigger_"
            r0.append(r7)
            r0.append(r10)
            java.lang.String r7 = "_"
            r0.append(r7)
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = r0.toString()
            r9.mo11018s(r5)
            int r4 = r4 + 1
            goto Le
        L3c:
            return
    }

    /* renamed from: h */
    public void m8098h() {
            r1 = this;
            k1.v r0 = r1.f16164d
            boolean r0 = r0.m8114k()
            if (r0 != 0) goto L9
            return
        L9:
            k1.v r0 = r1.f16164d
            o1.c r0 = r0.f16190d
            o1.a r0 = r0.mo8083o0()
            r1.m8099i(r0)
            return
    }

    /* renamed from: i */
    public void m8099i(p243o1.InterfaceC4871a r8) {
            r7 = this;
            boolean r0 = r8.mo11007M()
            if (r0 == 0) goto L7
            return
        L7:
            k1.v r0 = r7.f16164d     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.f16195i     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62
            r0.lock()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62
            k1.t$b r1 = r7.f16168h     // Catch: java.lang.Throwable -> L5b
            int[] r1 = r1.m8101a()     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L1e
            r0.unlock()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62
            return
        L1e:
            int r2 = r1.length     // Catch: java.lang.Throwable -> L5b
            boolean r3 = r8.mo11009U()     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L29
            r8.mo11011c0()     // Catch: java.lang.Throwable -> L5b
            goto L2c
        L29:
            r8.mo11014g()     // Catch: java.lang.Throwable -> L5b
        L2c:
            r3 = 0
            r4 = 0
        L2e:
            if (r4 >= r2) goto L43
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L56
            r6 = 1
            if (r5 == r6) goto L3d
            r6 = 2
            if (r5 == r6) goto L39
            goto L40
        L39:
            r7.m8097g(r8, r4)     // Catch: java.lang.Throwable -> L56
            goto L40
        L3d:
            r7.m8096f(r8, r4)     // Catch: java.lang.Throwable -> L56
        L40:
            int r4 = r4 + 1
            goto L2e
        L43:
            r8.mo11010Y()     // Catch: java.lang.Throwable -> L56
            r8.mo11013f()     // Catch: java.lang.Throwable -> L5b
            k1.t$b r1 = r7.f16168h     // Catch: java.lang.Throwable -> L5b
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L5b
            r1.f16177e = r3     // Catch: java.lang.Throwable -> L53
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L53
            r0.unlock()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62
            goto L7
        L53:
            r8 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L53
            throw r8     // Catch: java.lang.Throwable -> L5b
        L56:
            r1 = move-exception
            r8.mo11013f()     // Catch: java.lang.Throwable -> L5b
            throw r1     // Catch: java.lang.Throwable -> L5b
        L5b:
            r8 = move-exception
            r0.unlock()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62
            throw r8     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62
        L60:
            r8 = move-exception
            goto L63
        L62:
            r8 = move-exception
        L63:
            java.lang.String r0 = "ROOM"
            java.lang.String r1 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r0, r1, r8)
            return
    }
}
