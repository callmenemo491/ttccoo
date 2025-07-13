package p229n2;

/* renamed from: n2.l */
/* loaded from: classes.dex */
public class C4682l implements p229n2.InterfaceC4680j {

    /* renamed from: d */
    public static final android.graphics.Bitmap.Config[] f18637d = null;

    /* renamed from: e */
    public static final android.graphics.Bitmap.Config[] f18638e = null;

    /* renamed from: f */
    public static final android.graphics.Bitmap.Config[] f18639f = null;

    /* renamed from: g */
    public static final android.graphics.Bitmap.Config[] f18640g = null;

    /* renamed from: h */
    public static final android.graphics.Bitmap.Config[] f18641h = null;

    /* renamed from: a */
    public final p229n2.C4682l.c f18642a;

    /* renamed from: b */
    public final p229n2.C4676f<p229n2.C4682l.b, android.graphics.Bitmap> f18643b;

    /* renamed from: c */
    public final java.util.Map<android.graphics.Bitmap.Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> f18644c;

    /* renamed from: n2.l$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18645a = null;

        static {
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p229n2.C4682l.a.f18645a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = p229n2.C4682l.a.f18645a     // Catch: java.lang.NoSuchFieldError -> L1d
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = p229n2.C4682l.a.f18645a     // Catch: java.lang.NoSuchFieldError -> L28
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = p229n2.C4682l.a.f18645a     // Catch: java.lang.NoSuchFieldError -> L33
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    /* renamed from: n2.l$b */
    public static final class b implements p229n2.InterfaceC4681k {

        /* renamed from: a */
        public final p229n2.C4682l.c f18646a;

        /* renamed from: b */
        public int f18647b;

        /* renamed from: c */
        public android.graphics.Bitmap.Config f18648c;

        public b(p229n2.C4682l.c r1) {
                r0 = this;
                r0.<init>()
                r0.f18646a = r1
                return
        }

        @Override // p229n2.InterfaceC4681k
        /* renamed from: a */
        public void mo10704a() {
                r1 = this;
                n2.l$c r0 = r1.f18646a
                r0.m13173g(r1)
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof p229n2.C4682l.b
                r1 = 0
                if (r0 == 0) goto L18
                n2.l$b r4 = (p229n2.C4682l.b) r4
                int r0 = r3.f18647b
                int r2 = r4.f18647b
                if (r0 != r2) goto L18
                android.graphics.Bitmap$Config r0 = r3.f18648c
                android.graphics.Bitmap$Config r4 = r4.f18648c
                boolean r4 = p106g3.C2238j.m5842b(r0, r4)
                if (r4 == 0) goto L18
                r1 = 1
            L18:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.f18647b
                int r0 = r0 * 31
                android.graphics.Bitmap$Config r1 = r2.f18648c
                if (r1 == 0) goto Ld
                int r1 = r1.hashCode()
                goto Le
            Ld:
                r1 = 0
            Le:
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                int r0 = r2.f18647b
                android.graphics.Bitmap$Config r1 = r2.f18648c
                java.lang.String r0 = p229n2.C4682l.m10711c(r0, r1)
                return r0
        }
    }

    /* renamed from: n2.l$c */
    public static class c extends p366v0.AbstractC6484c {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p366v0.AbstractC6484c
        /* renamed from: a */
        public p229n2.InterfaceC4681k mo10705a() {
                r1 = this;
                n2.l$b r0 = new n2.l$b
                r0.<init>(r1)
                return r0
        }

        /* renamed from: m */
        public p229n2.C4682l.b m10717m(int r2, android.graphics.Bitmap.Config r3) {
                r1 = this;
                n2.k r0 = r1.m13170c()
                n2.l$b r0 = (p229n2.C4682l.b) r0
                r0.f18647b = r2
                r0.f18648c = r3
                return r0
        }
    }

    static {
            r0 = 2
            android.graphics.Bitmap$Config[] r0 = new android.graphics.Bitmap.Config[r0]
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            r2 = 0
            r0[r2] = r1
            r1 = 0
            r3 = 1
            r0[r3] = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r1 < r4) goto L1f
            r1 = 3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            android.graphics.Bitmap$Config[] r0 = (android.graphics.Bitmap.Config[]) r0
            int r1 = r0.length
            int r1 = r1 - r3
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.RGBA_F16
            r0[r1] = r4
        L1f:
            p229n2.C4682l.f18637d = r0
            p229n2.C4682l.f18638e = r0
            android.graphics.Bitmap$Config[] r0 = new android.graphics.Bitmap.Config[r3]
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565
            r0[r2] = r1
            p229n2.C4682l.f18639f = r0
            android.graphics.Bitmap$Config[] r0 = new android.graphics.Bitmap.Config[r3]
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444
            r0[r2] = r1
            p229n2.C4682l.f18640g = r0
            android.graphics.Bitmap$Config[] r0 = new android.graphics.Bitmap.Config[r3]
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8
            r0[r2] = r1
            p229n2.C4682l.f18641h = r0
            return
    }

    public C4682l() {
            r1 = this;
            r1.<init>()
            n2.l$c r0 = new n2.l$c
            r0.<init>()
            r1.f18642a = r0
            n2.f r0 = new n2.f
            r0.<init>()
            r1.f18643b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f18644c = r0
            return
    }

    /* renamed from: c */
    public static java.lang.String m10711c(int r2, android.graphics.Bitmap.Config r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "]("
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* renamed from: a */
    public final void m10712a(java.lang.Integer r4, android.graphics.Bitmap r5) {
            r3 = this;
            android.graphics.Bitmap$Config r0 = r5.getConfig()
            java.util.NavigableMap r0 = r3.m10714d(r0)
            java.lang.Object r1 = r0.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L28
            int r5 = r1.intValue()
            r2 = 1
            if (r5 != r2) goto L1b
            r0.remove(r4)
            goto L27
        L1b:
            int r5 = r1.intValue()
            int r5 = r5 - r2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.put(r4, r5)
        L27:
            return
        L28:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Tried to decrement empty size, size: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", removed: "
            r1.append(r4)
            java.lang.String r4 = r3.m10715e(r5)
            r1.append(r4)
            java.lang.String r4 = ", this: "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* renamed from: b */
    public android.graphics.Bitmap m10713b(int r10, int r11, android.graphics.Bitmap.Config r12) {
            r9 = this;
            int r0 = p106g3.C2238j.m5843c(r10, r11, r12)
            n2.l$c r1 = r9.f18642a
            n2.k r1 = r1.m13170c()
            n2.l$b r1 = (p229n2.C4682l.b) r1
            r1.f18647b = r0
            r1.f18648c = r12
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            r4 = 0
            if (r2 < r3) goto L22
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGBA_F16
            boolean r2 = r2.equals(r12)
            if (r2 == 0) goto L22
            android.graphics.Bitmap$Config[] r2 = p229n2.C4682l.f18638e
            goto L46
        L22:
            int[] r2 = p229n2.C4682l.a.f18645a
            int r3 = r12.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L44
            r5 = 2
            if (r2 == r5) goto L41
            r5 = 3
            if (r2 == r5) goto L3e
            r5 = 4
            if (r2 == r5) goto L3b
            android.graphics.Bitmap$Config[] r2 = new android.graphics.Bitmap.Config[r3]
            r2[r4] = r12
            goto L46
        L3b:
            android.graphics.Bitmap$Config[] r2 = p229n2.C4682l.f18641h
            goto L46
        L3e:
            android.graphics.Bitmap$Config[] r2 = p229n2.C4682l.f18640g
            goto L46
        L41:
            android.graphics.Bitmap$Config[] r2 = p229n2.C4682l.f18639f
            goto L46
        L44:
            android.graphics.Bitmap$Config[] r2 = p229n2.C4682l.f18637d
        L46:
            int r3 = r2.length
        L47:
            if (r4 >= r3) goto L87
            r5 = r2[r4]
            java.util.NavigableMap r6 = r9.m10714d(r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.lang.Object r6 = r6.ceilingKey(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L84
            int r7 = r6.intValue()
            int r8 = r0 * 8
            if (r7 > r8) goto L84
            int r2 = r6.intValue()
            if (r2 != r0) goto L74
            if (r5 != 0) goto L6e
            if (r12 == 0) goto L87
            goto L74
        L6e:
            boolean r0 = r5.equals(r12)
            if (r0 != 0) goto L87
        L74:
            n2.l$c r0 = r9.f18642a
            r0.m13173g(r1)
            n2.l$c r0 = r9.f18642a
            int r1 = r6.intValue()
            n2.l$b r1 = r0.m10717m(r1, r5)
            goto L87
        L84:
            int r4 = r4 + 1
            goto L47
        L87:
            n2.f<n2.l$b, android.graphics.Bitmap> r0 = r9.f18643b
            java.lang.Object r0 = r0.m10695a(r1)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L9d
            int r1 = r1.f18647b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.m10712a(r1, r0)
            r0.reconfigure(r10, r11, r12)
        L9d:
            return r0
    }

    /* renamed from: d */
    public final java.util.NavigableMap<java.lang.Integer, java.lang.Integer> m10714d(android.graphics.Bitmap.Config r3) {
            r2 = this;
            java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> r0 = r2.f18644c
            java.lang.Object r0 = r0.get(r3)
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            if (r0 != 0) goto L14
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> r1 = r2.f18644c
            r1.put(r3, r0)
        L14:
            return r0
    }

    /* renamed from: e */
    public java.lang.String m10715e(android.graphics.Bitmap r2) {
            r1 = this;
            int r0 = p106g3.C2238j.m5844d(r2)
            android.graphics.Bitmap$Config r2 = r2.getConfig()
            java.lang.String r2 = m10711c(r0, r2)
            return r2
    }

    /* renamed from: f */
    public void m10716f(android.graphics.Bitmap r4) {
            r3 = this;
            int r0 = p106g3.C2238j.m5844d(r4)
            n2.l$c r1 = r3.f18642a
            android.graphics.Bitmap$Config r2 = r4.getConfig()
            n2.l$b r0 = r1.m10717m(r0, r2)
            n2.f<n2.l$b, android.graphics.Bitmap> r1 = r3.f18643b
            r1.m10696b(r0, r4)
            android.graphics.Bitmap$Config r4 = r4.getConfig()
            java.util.NavigableMap r4 = r3.m10714d(r4)
            int r1 = r0.f18647b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r4.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r0.f18647b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 1
            if (r1 != 0) goto L31
            goto L36
        L31:
            int r1 = r1.intValue()
            int r2 = r2 + r1
        L36:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r4.put(r0, r1)
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "SizeConfigStrategy{groupedMap="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            n2.f<n2.l$b, android.graphics.Bitmap> r1 = r4.f18643b
            r0.append(r1)
            java.lang.String r1 = ", sortedSizes=("
            r0.append(r1)
            java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> r1 = r4.f18644c
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            r0.append(r3)
            r3 = 91
            r0.append(r3)
            java.lang.Object r2 = r2.getValue()
            r0.append(r2)
            java.lang.String r2 = "], "
            r0.append(r2)
            goto L1a
        L3f:
            java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> r1 = r4.f18644c
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L56
            int r1 = r0.length()
            int r1 = r1 + (-2)
            int r2 = r0.length()
            java.lang.String r3 = ""
            r0.replace(r1, r2, r3)
        L56:
            java.lang.String r1 = ")}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
