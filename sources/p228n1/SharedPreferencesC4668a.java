package p228n1;

/* renamed from: n1.a */
/* loaded from: classes.dex */
public final class SharedPreferencesC4668a implements android.content.SharedPreferences {

    /* renamed from: a */
    public final android.content.SharedPreferences f18594a;

    /* renamed from: b */
    public final java.util.List<android.content.SharedPreferences.OnSharedPreferenceChangeListener> f18595b;

    /* renamed from: c */
    public final java.lang.String f18596c;

    /* renamed from: d */
    public final p093f9.InterfaceC2083a f18597d;

    /* renamed from: e */
    public final p093f9.InterfaceC2085c f18598e;

    /* renamed from: n1.a$a */
    public static final class a implements android.content.SharedPreferences.Editor {

        /* renamed from: a */
        public final p228n1.SharedPreferencesC4668a f18599a;

        /* renamed from: b */
        public final android.content.SharedPreferences.Editor f18600b;

        /* renamed from: c */
        public final java.util.List<java.lang.String> f18601c;

        /* renamed from: d */
        public java.util.concurrent.atomic.AtomicBoolean f18602d;

        public a(p228n1.SharedPreferencesC4668a r3, android.content.SharedPreferences.Editor r4) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r1 = 0
                r0.<init>(r1)
                r2.f18602d = r0
                r2.f18599a = r3
                r2.f18600b = r4
                java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
                r3.<init>()
                r2.f18601c = r3
                return
        }

        /* renamed from: a */
        public final void m10678a() {
                r4 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r4.f18602d
                r1 = 0
                boolean r0 = r0.getAndSet(r1)
                if (r0 == 0) goto L41
                n1.a r0 = r4.f18599a
                java.util.Map r0 = r0.getAll()
                java.util.HashMap r0 = (java.util.HashMap) r0
                java.util.Set r0 = r0.keySet()
                java.util.Iterator r0 = r0.iterator()
            L19:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L41
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.util.List<java.lang.String> r2 = r4.f18601c
                boolean r2 = r2.contains(r1)
                if (r2 != 0) goto L19
                n1.a r2 = r4.f18599a
                boolean r2 = r2.m10677c(r1)
                if (r2 != 0) goto L19
                android.content.SharedPreferences$Editor r2 = r4.f18600b
                n1.a r3 = r4.f18599a
                java.lang.String r1 = r3.m10675a(r1)
                r2.remove(r1)
                goto L19
            L41:
                return
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
                r1 = this;
                r1.m10678a()
                android.content.SharedPreferences$Editor r0 = r1.f18600b
                r0.apply()
                r1.m10679b()
                java.util.List<java.lang.String> r0 = r1.f18601c
                r0.clear()
                return
        }

        /* renamed from: b */
        public final void m10679b() {
                r5 = this;
                n1.a r0 = r5.f18599a
                java.util.List<android.content.SharedPreferences$OnSharedPreferenceChangeListener> r0 = r0.f18595b
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2c
                java.lang.Object r1 = r0.next()
                android.content.SharedPreferences$OnSharedPreferenceChangeListener r1 = (android.content.SharedPreferences.OnSharedPreferenceChangeListener) r1
                java.util.List<java.lang.String> r2 = r5.f18601c
                java.util.Iterator r2 = r2.iterator()
            L1a:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L8
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                n1.a r4 = r5.f18599a
                r1.onSharedPreferenceChanged(r4, r3)
                goto L1a
            L2c:
                return
        }

        /* renamed from: c */
        public final void m10680c(java.lang.String r3, byte[] r4) {
                r2 = this;
                n1.a r0 = r2.f18599a
                boolean r0 = r0.m10677c(r3)
                if (r0 != 0) goto L52
                java.util.List<java.lang.String> r0 = r2.f18601c
                r0.add(r3)
                if (r3 != 0) goto L11
                java.lang.String r3 = "__NULL__"
            L11:
                n1.a r0 = r2.f18599a     // Catch: java.security.GeneralSecurityException -> L3a
                java.lang.String r3 = r0.m10675a(r3)     // Catch: java.security.GeneralSecurityException -> L3a
                f9.a r0 = r0.f18597d     // Catch: java.security.GeneralSecurityException -> L3a
                java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.security.GeneralSecurityException -> L3a
                byte[] r1 = r3.getBytes(r1)     // Catch: java.security.GeneralSecurityException -> L3a
                byte[] r4 = r0.mo5506a(r4, r1)     // Catch: java.security.GeneralSecurityException -> L3a
                android.util.Pair r0 = new android.util.Pair     // Catch: java.security.GeneralSecurityException -> L3a
                java.lang.String r4 = p236n9.C4705f.m10755b(r4)     // Catch: java.security.GeneralSecurityException -> L3a
                r0.<init>(r3, r4)     // Catch: java.security.GeneralSecurityException -> L3a
                android.content.SharedPreferences$Editor r3 = r2.f18600b     // Catch: java.security.GeneralSecurityException -> L3a
                java.lang.Object r4 = r0.first     // Catch: java.security.GeneralSecurityException -> L3a
                java.lang.String r4 = (java.lang.String) r4     // Catch: java.security.GeneralSecurityException -> L3a
                java.lang.Object r0 = r0.second     // Catch: java.security.GeneralSecurityException -> L3a
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.security.GeneralSecurityException -> L3a
                r3.putString(r4, r0)     // Catch: java.security.GeneralSecurityException -> L3a
                return
            L3a:
                r3 = move-exception
                java.lang.SecurityException r4 = new java.lang.SecurityException
                java.lang.String r0 = "Could not encrypt data: "
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r4.<init>(r0, r3)
                throw r4
            L52:
                java.lang.SecurityException r4 = new java.lang.SecurityException
                java.lang.String r0 = " is a reserved key for the encryption keyset."
                java.lang.String r3 = p064e.C1493g.m4049a(r3, r0)
                r4.<init>(r3)
                throw r4
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor clear() {
                r2 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r2.f18602d
                r1 = 1
                r0.set(r1)
                return r2
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
                r2 = this;
                r2.m10678a()
                android.content.SharedPreferences$Editor r0 = r2.f18600b     // Catch: java.lang.Throwable -> L12
                boolean r0 = r0.commit()     // Catch: java.lang.Throwable -> L12
                r2.m10679b()
                java.util.List<java.lang.String> r1 = r2.f18601c
                r1.clear()
                return r0
            L12:
                r0 = move-exception
                r2.m10679b()
                java.util.List<java.lang.String> r1 = r2.f18601c
                r1.clear()
                throw r0
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putBoolean(java.lang.String r3, boolean r4) {
                r2 = this;
                r0 = 5
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
                r1.putInt(r0)
                r1.put(r4)
                byte[] r4 = r1.array()
                r2.m10680c(r3, r4)
                return r2
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putFloat(java.lang.String r3, float r4) {
                r2 = this;
                r0 = 8
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
                r1 = 4
                r0.putInt(r1)
                r0.putFloat(r4)
                byte[] r4 = r0.array()
                r2.m10680c(r3, r4)
                return r2
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putInt(java.lang.String r3, int r4) {
                r2 = this;
                r0 = 8
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
                r1 = 2
                r0.putInt(r1)
                r0.putInt(r4)
                byte[] r4 = r0.array()
                r2.m10680c(r3, r4)
                return r2
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putLong(java.lang.String r3, long r4) {
                r2 = this;
                r0 = 12
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
                r1 = 3
                r0.putInt(r1)
                r0.putLong(r4)
                byte[] r4 = r0.array()
                r2.m10680c(r3, r4)
                return r2
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putString(java.lang.String r4, java.lang.String r5) {
                r3 = this;
                if (r5 != 0) goto L4
                java.lang.String r5 = "__NULL__"
            L4:
                java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
                byte[] r5 = r5.getBytes(r0)
                int r0 = r5.length
                int r1 = r0 + 8
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
                r2 = 0
                r1.putInt(r2)
                r1.putInt(r0)
                r1.put(r5)
                byte[] r5 = r1.array()
                r3.m10680c(r4, r5)
                return r3
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putStringSet(java.lang.String r5, java.util.Set<java.lang.String> r6) {
                r4 = this;
                if (r6 != 0) goto Ld
                s.c r6 = new s.c
                r0 = 0
                r6.<init>(r0)
                java.lang.String r0 = "__NULL__"
                r6.add(r0)
            Ld:
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r6.size()
                r0.<init>(r1)
                int r1 = r6.size()
                int r1 = r1 * 4
                java.util.Iterator r6 = r6.iterator()
            L20:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L38
                java.lang.Object r2 = r6.next()
                java.lang.String r2 = (java.lang.String) r2
                java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
                byte[] r2 = r2.getBytes(r3)
                r0.add(r2)
                int r2 = r2.length
                int r1 = r1 + r2
                goto L20
            L38:
                int r1 = r1 + 4
                java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r1)
                r1 = 1
                r6.putInt(r1)
                java.util.Iterator r0 = r0.iterator()
            L46:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L5a
                java.lang.Object r1 = r0.next()
                byte[] r1 = (byte[]) r1
                int r2 = r1.length
                r6.putInt(r2)
                r6.put(r1)
                goto L46
            L5a:
                byte[] r6 = r6.array()
                r4.m10680c(r5, r6)
                return r4
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor remove(java.lang.String r3) {
                r2 = this;
                n1.a r0 = r2.f18599a
                boolean r0 = r0.m10677c(r3)
                if (r0 != 0) goto L19
                android.content.SharedPreferences$Editor r0 = r2.f18600b
                n1.a r1 = r2.f18599a
                java.lang.String r1 = r1.m10675a(r3)
                r0.remove(r1)
                java.util.List<java.lang.String> r0 = r2.f18601c
                r0.remove(r3)
                return r2
            L19:
                java.lang.SecurityException r0 = new java.lang.SecurityException
                java.lang.String r1 = " is a reserved key for the encryption keyset."
                java.lang.String r3 = p064e.C1493g.m4049a(r3, r1)
                r0.<init>(r3)
                throw r0
        }
    }

    /* renamed from: n1.a$b */
    public enum b extends java.lang.Enum<p228n1.SharedPreferencesC4668a.b> {

        /* renamed from: Z */
        public static final p228n1.SharedPreferencesC4668a.b f18603Z = null;

        /* renamed from: a0 */
        public static final /* synthetic */ p228n1.SharedPreferencesC4668a.b[] f18604a0 = null;

        /* renamed from: Y */
        public final p093f9.C2088f f18605Y;

        static {
                n1.a$b r0 = new n1.a$b
                l9.o$b r1 = p204l9.C4221o.m9484z()
                r1.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r2 = r1.f18293Z
                l9.o r2 = (p204l9.C4221o) r2
                r3 = 64
                p204l9.C4221o.m9483x(r2, r3)
                m9.x r1 = r1.m10375k()
                l9.o r1 = (p204l9.C4221o) r1
                h9.a r2 = new h9.a
                r2.<init>()
                byte[] r1 = r1.mo9889e()
                java.lang.String r2 = "type.googleapis.com/google.crypto.tink.AesSivKey"
                r3 = 1
                f9.f r1 = p093f9.C2088f.m5513a(r2, r1, r3)
                java.lang.String r2 = "AES256_SIV"
                r4 = 0
                r0.<init>(r2, r4, r1)
                p228n1.SharedPreferencesC4668a.b.f18603Z = r0
                n1.a$b[] r1 = new p228n1.SharedPreferencesC4668a.b[r3]
                r1[r4] = r0
                p228n1.SharedPreferencesC4668a.b.f18604a0 = r1
                return
        }

        b(java.lang.String r1, int r2, p093f9.C2088f r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.f18605Y = r3
                return
        }

        public static p228n1.SharedPreferencesC4668a.b valueOf(java.lang.String r1) {
                java.lang.Class<n1.a$b> r0 = p228n1.SharedPreferencesC4668a.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                n1.a$b r1 = (p228n1.SharedPreferencesC4668a.b) r1
                return r1
        }

        public static p228n1.SharedPreferencesC4668a.b[] values() {
                n1.a$b[] r0 = p228n1.SharedPreferencesC4668a.b.f18604a0
                java.lang.Object r0 = r0.clone()
                n1.a$b[] r0 = (p228n1.SharedPreferencesC4668a.b[]) r0
                return r0
        }
    }

    /* renamed from: n1.a$c */
    public enum c extends java.lang.Enum<p228n1.SharedPreferencesC4668a.c> {

        /* renamed from: Z */
        public static final p228n1.SharedPreferencesC4668a.c f18606Z = null;

        /* renamed from: a0 */
        public static final /* synthetic */ p228n1.SharedPreferencesC4668a.c[] f18607a0 = null;

        /* renamed from: Y */
        public final p093f9.C2088f f18608Y;

        static {
                n1.a$c r0 = new n1.a$c
                l9.m$b r1 = p204l9.C4219m.m9472z()
                r1.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r2 = r1.f18293Z
                l9.m r2 = (p204l9.C4219m) r2
                r3 = 32
                p204l9.C4219m.m9471x(r2, r3)
                m9.x r1 = r1.m10375k()
                l9.m r1 = (p204l9.C4219m) r1
                g9.f r2 = new g9.f
                r2.<init>()
                byte[] r1 = r1.mo9889e()
                java.lang.String r2 = "type.googleapis.com/google.crypto.tink.AesGcmKey"
                r3 = 1
                f9.f r1 = p093f9.C2088f.m5513a(r2, r1, r3)
                java.lang.String r2 = "AES256_GCM"
                r4 = 0
                r0.<init>(r2, r4, r1)
                p228n1.SharedPreferencesC4668a.c.f18606Z = r0
                n1.a$c[] r1 = new p228n1.SharedPreferencesC4668a.c[r3]
                r1[r4] = r0
                p228n1.SharedPreferencesC4668a.c.f18607a0 = r1
                return
        }

        c(java.lang.String r1, int r2, p093f9.C2088f r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.f18608Y = r3
                return
        }

        public static p228n1.SharedPreferencesC4668a.c valueOf(java.lang.String r1) {
                java.lang.Class<n1.a$c> r0 = p228n1.SharedPreferencesC4668a.c.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                n1.a$c r1 = (p228n1.SharedPreferencesC4668a.c) r1
                return r1
        }

        public static p228n1.SharedPreferencesC4668a.c[] values() {
                n1.a$c[] r0 = p228n1.SharedPreferencesC4668a.c.f18607a0
                java.lang.Object r0 = r0.clone()
                n1.a$c[] r0 = (p228n1.SharedPreferencesC4668a.c[]) r0
                return r0
        }
    }

    public SharedPreferencesC4668a(java.lang.String r1, java.lang.String r2, android.content.SharedPreferences r3, p093f9.InterfaceC2083a r4, p093f9.InterfaceC2085c r5) {
            r0 = this;
            r0.<init>()
            r0.f18596c = r1
            r0.f18594a = r3
            r0.f18597d = r4
            r0.f18598e = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f18595b = r1
            return
    }

    /* renamed from: a */
    public java.lang.String m10675a(java.lang.String r4) {
            r3 = this;
            if (r4 != 0) goto L4
            java.lang.String r4 = "__NULL__"
        L4:
            f9.c r0 = r3.f18598e     // Catch: java.security.GeneralSecurityException -> L1b
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.security.GeneralSecurityException -> L1b
            byte[] r4 = r4.getBytes(r1)     // Catch: java.security.GeneralSecurityException -> L1b
            java.lang.String r1 = r3.f18596c     // Catch: java.security.GeneralSecurityException -> L1b
            byte[] r1 = r1.getBytes()     // Catch: java.security.GeneralSecurityException -> L1b
            byte[] r4 = r0.mo5508a(r4, r1)     // Catch: java.security.GeneralSecurityException -> L1b
            java.lang.String r4 = p236n9.C4705f.m10755b(r4)     // Catch: java.security.GeneralSecurityException -> L1b
            return r4
        L1b:
            r4 = move-exception
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Could not encrypt key. "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = r4.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            throw r0
    }

    /* renamed from: b */
    public final java.lang.Object m10676b(java.lang.String r10) {
            r9 = this;
            boolean r0 = r9.m10677c(r10)
            if (r0 != 0) goto L100
            java.lang.String r0 = "__NULL__"
            if (r10 != 0) goto Lb
            r10 = r0
        Lb:
            java.lang.String r10 = r9.m10675a(r10)     // Catch: java.security.GeneralSecurityException -> Le8
            android.content.SharedPreferences r1 = r9.f18594a     // Catch: java.security.GeneralSecurityException -> Le8
            r2 = 0
            java.lang.String r1 = r1.getString(r10, r2)     // Catch: java.security.GeneralSecurityException -> Le8
            if (r1 == 0) goto Le7
            r3 = 0
            byte[] r1 = p236n9.C4705f.m10754a(r1, r3)     // Catch: java.security.GeneralSecurityException -> Le8
            f9.a r4 = r9.f18597d     // Catch: java.security.GeneralSecurityException -> Le8
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.security.GeneralSecurityException -> Le8
            byte[] r10 = r10.getBytes(r5)     // Catch: java.security.GeneralSecurityException -> Le8
            byte[] r10 = r4.mo5507b(r1, r10)     // Catch: java.security.GeneralSecurityException -> Le8
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r10)     // Catch: java.security.GeneralSecurityException -> Le8
            r10.position(r3)     // Catch: java.security.GeneralSecurityException -> Le8
            int r1 = r10.getInt()     // Catch: java.security.GeneralSecurityException -> Le8
            r4 = 2
            r5 = 3
            r6 = 4
            r7 = 5
            r8 = 1
            if (r1 == 0) goto L51
            if (r1 == r8) goto L4f
            if (r1 == r4) goto L4d
            if (r1 == r5) goto L4b
            if (r1 == r6) goto L49
            if (r1 == r7) goto L47
            r1 = 0
            goto L52
        L47:
            r1 = 6
            goto L52
        L49:
            r1 = 5
            goto L52
        L4b:
            r1 = 4
            goto L52
        L4d:
            r1 = 3
            goto L52
        L4f:
            r1 = 2
            goto L52
        L51:
            r1 = 1
        L52:
            int r1 = p365v.C6480g.m13148b(r1)     // Catch: java.security.GeneralSecurityException -> Le8
            if (r1 == 0) goto Lca
            if (r1 == r8) goto L8d
            if (r1 == r4) goto L84
            if (r1 == r5) goto L7b
            if (r1 == r6) goto L71
            if (r1 == r7) goto L64
            goto Le7
        L64:
            byte r10 = r10.get()     // Catch: java.security.GeneralSecurityException -> Le8
            if (r10 == 0) goto L6b
            r3 = 1
        L6b:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch: java.security.GeneralSecurityException -> Le8
            goto Le7
        L71:
            float r10 = r10.getFloat()     // Catch: java.security.GeneralSecurityException -> Le8
            java.lang.Float r2 = java.lang.Float.valueOf(r10)     // Catch: java.security.GeneralSecurityException -> Le8
            goto Le7
        L7b:
            long r0 = r10.getLong()     // Catch: java.security.GeneralSecurityException -> Le8
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch: java.security.GeneralSecurityException -> Le8
            goto Le7
        L84:
            int r10 = r10.getInt()     // Catch: java.security.GeneralSecurityException -> Le8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch: java.security.GeneralSecurityException -> Le8
            goto Le7
        L8d:
            s.c r1 = new s.c     // Catch: java.security.GeneralSecurityException -> Le8
            r1.<init>(r3)     // Catch: java.security.GeneralSecurityException -> Le8
        L92:
            boolean r4 = r10.hasRemaining()     // Catch: java.security.GeneralSecurityException -> Le8
            if (r4 == 0) goto Lb9
            int r4 = r10.getInt()     // Catch: java.security.GeneralSecurityException -> Le8
            java.nio.ByteBuffer r5 = r10.slice()     // Catch: java.security.GeneralSecurityException -> Le8
            r5.limit(r4)     // Catch: java.security.GeneralSecurityException -> Le8
            int r6 = r10.position()     // Catch: java.security.GeneralSecurityException -> Le8
            int r6 = r6 + r4
            r10.position(r6)     // Catch: java.security.GeneralSecurityException -> Le8
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.security.GeneralSecurityException -> Le8
            java.nio.CharBuffer r4 = r4.decode(r5)     // Catch: java.security.GeneralSecurityException -> Le8
            java.lang.String r4 = r4.toString()     // Catch: java.security.GeneralSecurityException -> Le8
            r1.add(r4)     // Catch: java.security.GeneralSecurityException -> Le8
            goto L92
        Lb9:
            int r10 = r1.f22773a0     // Catch: java.security.GeneralSecurityException -> Le8
            if (r10 != r8) goto Lc8
            java.lang.Object[] r10 = r1.f22772Z     // Catch: java.security.GeneralSecurityException -> Le8
            r10 = r10[r3]     // Catch: java.security.GeneralSecurityException -> Le8
            boolean r10 = r0.equals(r10)     // Catch: java.security.GeneralSecurityException -> Le8
            if (r10 == 0) goto Lc8
            goto Le7
        Lc8:
            r2 = r1
            goto Le7
        Lca:
            int r1 = r10.getInt()     // Catch: java.security.GeneralSecurityException -> Le8
            java.nio.ByteBuffer r3 = r10.slice()     // Catch: java.security.GeneralSecurityException -> Le8
            r10.limit(r1)     // Catch: java.security.GeneralSecurityException -> Le8
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.security.GeneralSecurityException -> Le8
            java.nio.CharBuffer r10 = r10.decode(r3)     // Catch: java.security.GeneralSecurityException -> Le8
            java.lang.String r10 = r10.toString()     // Catch: java.security.GeneralSecurityException -> Le8
            boolean r0 = r10.equals(r0)     // Catch: java.security.GeneralSecurityException -> Le8
            if (r0 == 0) goto Le6
            goto Le7
        Le6:
            r2 = r10
        Le7:
            return r2
        Le8:
            r10 = move-exception
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Could not decrypt value. "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = r10.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r10)
            throw r0
        L100:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = " is a reserved key for the encryption keyset."
            java.lang.String r10 = p064e.C1493g.m4049a(r10, r1)
            r0.<init>(r10)
            throw r0
    }

    /* renamed from: c */
    public boolean m10677c(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "__androidx_security_crypto_encrypted_prefs_key_keyset__"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L13
            java.lang.String r0 = "__androidx_security_crypto_encrypted_prefs_value_keyset__"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    @Override // android.content.SharedPreferences
    public boolean contains(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.m10677c(r3)
            if (r0 != 0) goto L11
            java.lang.String r3 = r2.m10675a(r3)
            android.content.SharedPreferences r0 = r2.f18594a
            boolean r3 = r0.contains(r3)
            return r3
        L11:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = " is a reserved key for the encryption keyset."
            java.lang.String r3 = p064e.C1493g.m4049a(r3, r1)
            r0.<init>(r3)
            throw r0
    }

    @Override // android.content.SharedPreferences
    public android.content.SharedPreferences.Editor edit() {
            r2 = this;
            n1.a$a r0 = new n1.a$a
            android.content.SharedPreferences r1 = r2.f18594a
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r0.<init>(r2, r1)
            return r0
    }

    @Override // android.content.SharedPreferences
    public java.util.Map<java.lang.String, ?> getAll() {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.content.SharedPreferences r1 = r5.f18594a
            java.util.Map r1 = r1.getAll()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r5.m10677c(r3)
            if (r3 != 0) goto L13
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            f9.c r3 = r5.f18598e     // Catch: java.security.GeneralSecurityException -> L5a
            r4 = 0
            byte[] r2 = p236n9.C4705f.m10754a(r2, r4)     // Catch: java.security.GeneralSecurityException -> L5a
            java.lang.String r4 = r5.f18596c     // Catch: java.security.GeneralSecurityException -> L5a
            byte[] r4 = r4.getBytes()     // Catch: java.security.GeneralSecurityException -> L5a
            byte[] r2 = r3.mo5509b(r2, r4)     // Catch: java.security.GeneralSecurityException -> L5a
            java.lang.String r3 = new java.lang.String     // Catch: java.security.GeneralSecurityException -> L5a
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.security.GeneralSecurityException -> L5a
            r3.<init>(r2, r4)     // Catch: java.security.GeneralSecurityException -> L5a
            java.lang.String r2 = "__NULL__"
            boolean r2 = r3.equals(r2)     // Catch: java.security.GeneralSecurityException -> L5a
            if (r2 == 0) goto L52
            r3 = 0
        L52:
            java.lang.Object r2 = r5.m10676b(r3)
            r0.put(r3, r2)
            goto L13
        L5a:
            r0 = move-exception
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.String r2 = "Could not decrypt key. "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L72:
            return r0
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.Object r2 = r1.m10676b(r2)
            if (r2 == 0) goto L10
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto L10
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r3 = r2.booleanValue()
        L10:
            return r3
    }

    @Override // android.content.SharedPreferences
    public float getFloat(java.lang.String r2, float r3) {
            r1 = this;
            java.lang.Object r2 = r1.m10676b(r2)
            if (r2 == 0) goto L10
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 == 0) goto L10
            java.lang.Float r2 = (java.lang.Float) r2
            float r3 = r2.floatValue()
        L10:
            return r3
    }

    @Override // android.content.SharedPreferences
    public int getInt(java.lang.String r2, int r3) {
            r1 = this;
            java.lang.Object r2 = r1.m10676b(r2)
            if (r2 == 0) goto L10
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L10
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
        L10:
            return r3
    }

    @Override // android.content.SharedPreferences
    public long getLong(java.lang.String r2, long r3) {
            r1 = this;
            java.lang.Object r2 = r1.m10676b(r2)
            if (r2 == 0) goto L10
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto L10
            java.lang.Long r2 = (java.lang.Long) r2
            long r3 = r2.longValue()
        L10:
            return r3
    }

    @Override // android.content.SharedPreferences
    public java.lang.String getString(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.Object r2 = r1.m10676b(r2)
            if (r2 == 0) goto Ld
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto Ld
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
        Ld:
            return r3
    }

    @Override // android.content.SharedPreferences
    public java.util.Set<java.lang.String> getStringSet(java.lang.String r2, java.util.Set<java.lang.String> r3) {
            r1 = this;
            java.lang.Object r2 = r1.m10676b(r2)
            boolean r0 = r2 instanceof java.util.Set
            if (r0 == 0) goto Lb
            java.util.Set r2 = (java.util.Set) r2
            goto L11
        Lb:
            s.c r2 = new s.c
            r0 = 0
            r2.<init>(r0)
        L11:
            int r0 = r2.size()
            if (r0 <= 0) goto L18
            r3 = r2
        L18:
            return r3
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r2) {
            r1 = this;
            java.util.List<android.content.SharedPreferences$OnSharedPreferenceChangeListener> r0 = r1.f18595b
            r0.add(r2)
            return
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r2) {
            r1 = this;
            java.util.List<android.content.SharedPreferences$OnSharedPreferenceChangeListener> r0 = r1.f18595b
            r0.remove(r2)
            return
    }
}
