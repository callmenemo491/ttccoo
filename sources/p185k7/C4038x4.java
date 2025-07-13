package p185k7;

/* renamed from: k7.x4 */
/* loaded from: classes.dex */
public class C4038x4 {
    /* renamed from: a */
    public static final <T, G, K, R> androidx.lifecycle.LiveData<R> m9088a(androidx.lifecycle.LiveData<T> r9, androidx.lifecycle.LiveData<K> r10, androidx.lifecycle.LiveData<G> r11, mh.InterfaceC4625q<? super T, ? super K, ? super G, ? extends R> r12) {
            androidx.lifecycle.b0 r7 = new androidx.lifecycle.b0
            r7.<init>()
            vg.h r8 = new vg.h
            r6 = 0
            r0 = r8
            r1 = r7
            r2 = r12
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.m1428m(r9, r8)
            vg.h r8 = new vg.h
            r6 = 1
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.m1428m(r10, r8)
            vg.h r8 = new vg.h
            r6 = 2
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.m1428m(r11, r8)
            return r7
    }

    /* renamed from: b */
    public static final <T, K, R> androidx.lifecycle.LiveData<R> m9089b(androidx.lifecycle.LiveData<T> r8, androidx.lifecycle.LiveData<K> r9, mh.InterfaceC4624p<? super T, ? super K, ? extends R> r10) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "liveData"
            p214m2.C4339q.m9706k(r9, r0)
            androidx.lifecycle.b0 r0 = new androidx.lifecycle.b0
            r0.<init>()
            vg.g r7 = new vg.g
            r6 = 0
            r1 = r7
            r2 = r0
            r3 = r10
            r4 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r0.m1428m(r8, r7)
            vg.g r7 = new vg.g
            r6 = 1
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r0.m1428m(r9, r7)
            return r0
    }

    /* renamed from: c */
    public static final <T, K, R> androidx.lifecycle.LiveData<R> m9090c(androidx.lifecycle.LiveData<T> r8, androidx.lifecycle.LiveData<K> r9, mh.InterfaceC4624p<? super T, ? super K, ? extends R> r10) {
            java.lang.String r0 = "liveData2"
            p214m2.C4339q.m9706k(r9, r0)
            androidx.lifecycle.b0 r0 = new androidx.lifecycle.b0
            r0.<init>()
            vg.g r7 = new vg.g
            r6 = 2
            r1 = r7
            r2 = r0
            r3 = r10
            r4 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r0.m1428m(r8, r7)
            vg.g r7 = new vg.g
            r6 = 3
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r0.m1428m(r9, r7)
            return r0
    }

    /* renamed from: d */
    public static float m9091d(float r0, float r1, float r2, float r3) {
            float r0 = r0 - r2
            float r1 = r1 - r3
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r1 = r1 + r0
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            return r0
    }

    /* renamed from: e */
    public static float m9092e(int r0, int r1, int r2, int r3) {
            int r0 = r0 - r2
            int r1 = r1 - r3
            int r0 = r0 * r0
            int r1 = r1 * r1
            int r1 = r1 + r0
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            return r0
    }

    /* renamed from: f */
    public static final byte[] m9093f(java.util.List<java.lang.String> r12) {
            java.lang.String r0 = "stringList"
            p214m2.C4339q.m9706k(r12, r0)
            h7.rb r0 = new h7.rb
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2)
            r0 = r2 & r2
            if (r0 == 0) goto L16
            ed.a r0 = new ed.a
            r0.<init>()
            goto L17
        L16:
            r0 = r1
        L17:
            java.lang.String r3 = "hexWriter"
            p214m2.C4339q.m9707l(r0, r3)
            cd.b r0 = new cd.b
            r3 = 500(0x1f4, float:7.0E-43)
            r4 = 0
            r5 = 6
            r0.<init>(r3, r1, r4, r5)
            int r1 = r12.size()
            long r6 = (long) r1
        L2a:
            r1 = 128(0x80, float:1.8E-43)
            long r8 = (long) r1
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L3f
            r8 = 127(0x7f, double:6.27E-322)
            long r8 = r8 & r6
            r10 = 128(0x80, double:6.3E-322)
            long r8 = r8 | r10
            int r1 = (int) r8
            byte r1 = (byte) r1
            r0.m2671a(r1)
            r1 = 7
            long r6 = r6 >>> r1
            goto L2a
        L3f:
            int r1 = (int) r6
            byte r1 = (byte) r1
            r0.m2671a(r1)
            boolean r1 = r12.isEmpty()
            r1 = r1 ^ r2
            if (r1 == 0) goto L7f
            java.util.Iterator r12 = r12.iterator()
        L4f:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r12.next()
            java.lang.String r1 = (java.lang.String) r1
            long r1 = java.lang.Long.parseLong(r1)
            java.util.Objects.requireNonNull(r0)
            r3 = 8
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            java.nio.ByteOrder r6 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r3 = r3.order(r6)
            java.nio.ByteBuffer r1 = r3.putLong(r1)
            byte[] r1 = r1.array()
            java.lang.String r2 = "this"
            p214m2.C4339q.m9703h(r1, r2)
            cd.C0947b.m2670b(r0, r1, r4, r4, r5)
            goto L4f
        L7f:
            int r12 = r0.f4937b
            byte[] r1 = new byte[r12]
            if (r12 <= 0) goto L8a
            byte[] r0 = r0.f4936a
            java.lang.System.arraycopy(r0, r4, r1, r4, r12)
        L8a:
            return r1
    }

    /* renamed from: g */
    public static final byte[] m9094g(java.lang.String r13) {
            java.lang.String r0 = "string"
            p214m2.C4339q.m9706k(r13, r0)
            h7.rb r0 = new h7.rb
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2)
            r0 = r2 & r2
            if (r0 == 0) goto L16
            ed.a r0 = new ed.a
            r0.<init>()
            goto L17
        L16:
            r0 = r1
        L17:
            java.lang.String r3 = "hexWriter"
            p214m2.C4339q.m9707l(r0, r3)
            cd.b r0 = new cd.b
            r3 = 500(0x1f4, float:7.0E-43)
            r4 = 0
            r5 = 6
            r0.<init>(r3, r1, r4, r5)
            java.lang.String r1 = ","
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.util.List r13 = p362uh.C6467m.m13080k0(r13, r1, r4, r4, r5)
            java.lang.Object r1 = p062dh.C1473i.m3995G(r13)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = java.lang.Integer.parseInt(r1)
            java.lang.Object r13 = p062dh.C1473i.m4001M(r13)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r3 = "symbol"
            p214m2.C4339q.m9707l(r13, r3)
            int r3 = r13.length()
            if (r3 != 0) goto L4b
            goto L4c
        L4b:
            r2 = 0
        L4c:
            if (r2 != 0) goto Lb5
            int r2 = r13.length()
            r6 = 0
            r3 = 0
        L55:
            if (r3 >= r2) goto L88
            char r8 = r13.charAt(r3)
            long r8 = (long) r8
            r10 = 65
            long r10 = (long) r10
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 < 0) goto L71
            r10 = 90
            long r10 = (long) r10
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 > 0) goto L71
            int r3 = r3 + 1
            int r10 = r3 * 8
            long r8 = r8 << r10
            long r6 = r6 | r8
            goto L55
        L71:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid currency symbol string: "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        L88:
            long r1 = (long) r1
            long r1 = r1 | r6
            java.util.Objects.requireNonNull(r0)
            r13 = 8
            java.nio.ByteBuffer r13 = java.nio.ByteBuffer.allocate(r13)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r13 = r13.order(r3)
            java.nio.ByteBuffer r13 = r13.putLong(r1)
            byte[] r13 = r13.array()
            java.lang.String r1 = "this"
            p214m2.C4339q.m9703h(r13, r1)
            cd.C0947b.m2670b(r0, r13, r4, r4, r5)
            int r13 = r0.f4937b
            byte[] r1 = new byte[r13]
            if (r13 <= 0) goto Lb4
            byte[] r0 = r0.f4936a
            java.lang.System.arraycopy(r0, r4, r1, r4, r13)
        Lb4:
            return r1
        Lb5:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "empty currency symbol string"
            r13.<init>(r0)
            throw r13
    }

    /* renamed from: h */
    public static boolean m9095h() {
            r0 = 0
            java.lang.String r1 = "android.app.Application"
            r2 = 0
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.Exception -> L8
            r0 = 1
        L8:
            return r0
    }

    /* renamed from: i */
    public static final <T> ch.InterfaceC0977d<T> m9096i(mh.InterfaceC4609a<? extends T> r3) {
            ch.g r0 = new ch.g
            r1 = 0
            r2 = 2
            r0.<init>(r3, r1, r2)
            return r0
    }

    /* renamed from: j */
    public static final int m9097j(int r1) {
            if (r1 >= 0) goto L3
            goto L19
        L3:
            r0 = 3
            if (r1 >= r0) goto L9
            int r1 = r1 + 1
            goto L19
        L9:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 >= r0) goto L16
            float r1 = (float) r1
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            int r1 = (int) r1
            goto L19
        L16:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L19:
            return r1
    }

    /* renamed from: k */
    public static final <K, V> java.util.Map<K, V> m9098k(ch.C0978e<? extends K, ? extends V> r1) {
            java.lang.String r0 = "pair"
            p214m2.C4339q.m9706k(r1, r0)
            A r0 = r1.f5050Y
            B r1 = r1.f5051Z
            java.util.Map r1 = java.util.Collections.singletonMap(r0, r1)
            java.lang.String r0 = "singletonMap(pair.first, pair.second)"
            p214m2.C4339q.m9705j(r1, r0)
            return r1
    }

    /* renamed from: l */
    public static int m9099l(float r1) {
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L8
            r0 = -1090519040(0xffffffffbf000000, float:-0.5)
            goto La
        L8:
            r0 = 1056964608(0x3f000000, float:0.5)
        La:
            float r1 = r1 + r0
            int r1 = (int) r1
            return r1
    }

    /* renamed from: m */
    public static int m9100m(int[] r4) {
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L3:
            if (r1 >= r0) goto Lb
            r3 = r4[r1]
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L3
        Lb:
            return r2
    }

    /* renamed from: n */
    public static final <K, V> java.util.Map<K, V> m9101n(java.util.Map<? extends K, ? extends V> r1) {
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.util.Map r1 = java.util.Collections.singletonMap(r0, r1)
            java.lang.String r0 = "with(entries.iterator().\u2026ingletonMap(key, value) }"
            p214m2.C4339q.m9705j(r1, r0)
            return r1
    }

    /* renamed from: o */
    public static p124h7.C2681if m9102o(p375v9.AbstractC6590c r10, java.lang.String r11) {
            java.lang.Class<v9.r> r0 = p375v9.C6620r.class
            java.lang.Class r1 = r10.getClass()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L20
            v9.r r10 = (p375v9.C6620r) r10
            h7.if r9 = new h7.if
            java.lang.String r1 = r10.f25795Y
            java.lang.String r2 = r10.f25796Z
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            java.lang.String r3 = "google.com"
            r0 = r9
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        L20:
            java.lang.Class<v9.f> r0 = p375v9.C6596f.class
            java.lang.Class r1 = r10.getClass()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L3f
            v9.f r10 = (p375v9.C6596f) r10
            h7.if r9 = new h7.if
            r1 = 0
            java.lang.String r2 = r10.f25780Y
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            java.lang.String r3 = "facebook.com"
            r0 = r9
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        L3f:
            java.lang.Class<v9.y> r0 = p375v9.C6627y.class
            java.lang.Class r1 = r10.getClass()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L5f
            v9.y r10 = (p375v9.C6627y) r10
            h7.if r9 = new h7.if
            r1 = 0
            java.lang.String r2 = r10.f25809Y
            java.lang.String r4 = r10.f25810Z
            r5 = 0
            r7 = 0
            r8 = 0
            java.lang.String r3 = "twitter.com"
            r0 = r9
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        L5f:
            java.lang.Class<v9.q> r0 = p375v9.C6618q.class
            java.lang.Class r1 = r10.getClass()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L7e
            v9.q r10 = (p375v9.C6618q) r10
            h7.if r9 = new h7.if
            r1 = 0
            java.lang.String r2 = r10.f25794Y
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            java.lang.String r3 = "github.com"
            r0 = r9
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        L7e:
            java.lang.Class<v9.x> r0 = p375v9.C6626x.class
            java.lang.Class r1 = r10.getClass()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L9d
            v9.x r10 = (p375v9.C6626x) r10
            h7.if r9 = new h7.if
            r1 = 0
            r2 = 0
            r4 = 0
            java.lang.String r5 = r10.f25808Y
            r7 = 0
            r8 = 0
            java.lang.String r3 = "playgames.google.com"
            r0 = r9
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        L9d:
            java.lang.Class<v9.j0> r0 = p375v9.C6605j0.class
            java.lang.Class r1 = r10.getClass()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto Lc5
            v9.j0 r10 = (p375v9.C6605j0) r10
            h7.if r0 = r10.f25784b0
            if (r0 == 0) goto Lb0
            goto Lc4
        Lb0:
            h7.if r0 = new h7.if
            java.lang.String r2 = r10.f25782Z
            java.lang.String r3 = r10.f25783a0
            java.lang.String r4 = r10.f25781Y
            java.lang.String r5 = r10.f25786d0
            r6 = 0
            java.lang.String r8 = r10.f25785c0
            java.lang.String r9 = r10.f25787e0
            r1 = r0
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
        Lc4:
            return r0
        Lc5:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Unsupported credential type."
            r10.<init>(r11)
            throw r10
    }

    /* renamed from: p */
    public static <T> p185k7.InterfaceC3986t4<T> m9103p(p185k7.InterfaceC3986t4<T> r1) {
            boolean r0 = r1 instanceof p185k7.C4012v4
            if (r0 != 0) goto L19
            boolean r0 = r1 instanceof p185k7.C3999u4
            if (r0 == 0) goto L9
            goto L19
        L9:
            boolean r0 = r1 instanceof java.io.Serializable
            if (r0 == 0) goto L13
            k7.u4 r0 = new k7.u4
            r0.<init>(r1)
            goto L18
        L13:
            k7.v4 r0 = new k7.v4
            r0.<init>(r1)
        L18:
            return r0
        L19:
            return r1
    }

    /* renamed from: q */
    public static void m9104q(com.google.android.gms.measurement.internal.C1111b r15, android.database.sqlite.SQLiteDatabase r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String[] r20) {
            r1 = r15
            r10 = r16
            r11 = r17
            r12 = r20
            if (r1 == 0) goto Lfa
            r13 = 0
            r14 = 0
            java.lang.String r0 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L32
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L32
            r6[r14] = r11     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L32
            java.lang.String r3 = "SQLITE_MASTER"
            java.lang.String r5 = "name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r16
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L32
            boolean r0 = r2.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L2d java.lang.Throwable -> Lf2
            r2.close()
            if (r0 != 0) goto L45
            goto L40
        L2d:
            r0 = move-exception
            goto L34
        L2f:
            r0 = move-exception
            goto Lf4
        L32:
            r0 = move-exception
            r2 = r13
        L34:
            o7.f3 r3 = r1.f5675i     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r4 = "Error querying for table"
            r3.m11171e(r4, r11, r0)     // Catch: java.lang.Throwable -> Lf2
            if (r2 == 0) goto L40
            r2.close()
        L40:
            r2 = r18
            r10.execSQL(r2)
        L45:
            java.util.HashSet r0 = new java.util.HashSet     // Catch: android.database.sqlite.SQLiteException -> Le9
            r0.<init>()     // Catch: android.database.sqlite.SQLiteException -> Le9
            int r2 = r17.length()     // Catch: android.database.sqlite.SQLiteException -> Le9
            int r2 = r2 + 22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.database.sqlite.SQLiteException -> Le9
            r3.<init>(r2)     // Catch: android.database.sqlite.SQLiteException -> Le9
            java.lang.String r2 = "SELECT * FROM "
            r3.append(r2)     // Catch: android.database.sqlite.SQLiteException -> Le9
            r3.append(r11)     // Catch: android.database.sqlite.SQLiteException -> Le9
            java.lang.String r2 = " LIMIT 0"
            r3.append(r2)     // Catch: android.database.sqlite.SQLiteException -> Le9
            java.lang.String r2 = r3.toString()     // Catch: android.database.sqlite.SQLiteException -> Le9
            android.database.Cursor r2 = r10.rawQuery(r2, r13)     // Catch: android.database.sqlite.SQLiteException -> Le9
            java.lang.String[] r3 = r2.getColumnNames()     // Catch: java.lang.Throwable -> Le4
            java.util.Collections.addAll(r0, r3)     // Catch: java.lang.Throwable -> Le4
            r2.close()     // Catch: android.database.sqlite.SQLiteException -> Le9
            java.lang.String r2 = ","
            r3 = r19
            java.lang.String[] r2 = r3.split(r2)     // Catch: android.database.sqlite.SQLiteException -> Le9
            int r3 = r2.length     // Catch: android.database.sqlite.SQLiteException -> Le9
            r4 = 0
        L7e:
            if (r4 >= r3) goto Lb9
            r5 = r2[r4]     // Catch: android.database.sqlite.SQLiteException -> Le9
            boolean r6 = r0.remove(r5)     // Catch: android.database.sqlite.SQLiteException -> Le9
            if (r6 == 0) goto L8b
            int r4 = r4 + 1
            goto L7e
        L8b:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch: android.database.sqlite.SQLiteException -> Le9
            int r2 = r17.length()     // Catch: android.database.sqlite.SQLiteException -> Le9
            int r2 = r2 + 35
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch: android.database.sqlite.SQLiteException -> Le9
            int r3 = r3.length()     // Catch: android.database.sqlite.SQLiteException -> Le9
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.database.sqlite.SQLiteException -> Le9
            r3.<init>(r2)     // Catch: android.database.sqlite.SQLiteException -> Le9
            java.lang.String r2 = "Table "
            r3.append(r2)     // Catch: android.database.sqlite.SQLiteException -> Le9
            r3.append(r11)     // Catch: android.database.sqlite.SQLiteException -> Le9
            java.lang.String r2 = " is missing required column: "
            r3.append(r2)     // Catch: android.database.sqlite.SQLiteException -> Le9
            r3.append(r5)     // Catch: android.database.sqlite.SQLiteException -> Le9
            java.lang.String r2 = r3.toString()     // Catch: android.database.sqlite.SQLiteException -> Le9
            r0.<init>(r2)     // Catch: android.database.sqlite.SQLiteException -> Le9
            throw r0     // Catch: android.database.sqlite.SQLiteException -> Le9
        Lb9:
            if (r12 == 0) goto Ld0
        Lbb:
            int r2 = r12.length     // Catch: android.database.sqlite.SQLiteException -> Le9
            if (r14 >= r2) goto Ld0
            r2 = r12[r14]     // Catch: android.database.sqlite.SQLiteException -> Le9
            boolean r2 = r0.remove(r2)     // Catch: android.database.sqlite.SQLiteException -> Le9
            if (r2 != 0) goto Lcd
            int r2 = r14 + 1
            r2 = r12[r2]     // Catch: android.database.sqlite.SQLiteException -> Le9
            r10.execSQL(r2)     // Catch: android.database.sqlite.SQLiteException -> Le9
        Lcd:
            int r14 = r14 + 2
            goto Lbb
        Ld0:
            boolean r2 = r0.isEmpty()     // Catch: android.database.sqlite.SQLiteException -> Le9
            if (r2 != 0) goto Le3
            o7.f3 r2 = r1.f5675i     // Catch: android.database.sqlite.SQLiteException -> Le9
            java.lang.String r3 = "Table has extra columns. table, columns"
            java.lang.String r4 = ", "
            java.lang.String r0 = android.text.TextUtils.join(r4, r0)     // Catch: android.database.sqlite.SQLiteException -> Le9
            r2.m11171e(r3, r11, r0)     // Catch: android.database.sqlite.SQLiteException -> Le9
        Le3:
            return
        Le4:
            r0 = move-exception
            r2.close()     // Catch: android.database.sqlite.SQLiteException -> Le9
            throw r0     // Catch: android.database.sqlite.SQLiteException -> Le9
        Le9:
            r0 = move-exception
            o7.f3 r1 = r1.f5672f
            java.lang.String r2 = "Failed to verify columns on table that was just created"
            r1.m11170d(r2, r11)
            throw r0
        Lf2:
            r0 = move-exception
            r13 = r2
        Lf4:
            if (r13 == 0) goto Lf9
            r13.close()
        Lf9:
            throw r0
        Lfa:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Monitor must not be null"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: r */
    public static void m9105r(com.google.android.gms.measurement.internal.C1111b r3, android.database.sqlite.SQLiteDatabase r4) {
            if (r3 == 0) goto L42
            java.io.File r0 = new java.io.File
            java.lang.String r4 = r4.getPath()
            r0.<init>(r4)
            r4 = 0
            boolean r1 = r0.setReadable(r4, r4)
            if (r1 != 0) goto L19
            o7.f3 r1 = r3.f5675i
            java.lang.String r2 = "Failed to turn off database read permission"
            r1.m11169c(r2)
        L19:
            boolean r4 = r0.setWritable(r4, r4)
            if (r4 != 0) goto L26
            o7.f3 r4 = r3.f5675i
            java.lang.String r1 = "Failed to turn off database write permission"
            r4.m11169c(r1)
        L26:
            r4 = 1
            boolean r1 = r0.setReadable(r4, r4)
            if (r1 != 0) goto L34
            o7.f3 r1 = r3.f5675i
            java.lang.String r2 = "Failed to turn on database read permission for owner"
            r1.m11169c(r2)
        L34:
            boolean r4 = r0.setWritable(r4, r4)
            if (r4 != 0) goto L41
            o7.f3 r3 = r3.f5675i
            java.lang.String r4 = "Failed to turn on database write permission for owner"
            r3.m11169c(r4)
        L41:
            return
        L42:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Monitor must not be null"
            r3.<init>(r4)
            throw r3
    }
}
