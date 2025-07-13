package p118h1;

/* renamed from: h1.b */
/* loaded from: classes.dex */
public final class C2437b {

    /* renamed from: f */
    public static final p118h1.C2437b.c f10886f = null;

    /* renamed from: a */
    public final java.util.List<p118h1.C2437b.d> f10887a;

    /* renamed from: b */
    public final java.util.List<p118h1.C2438c> f10888b;

    /* renamed from: c */
    public final java.util.Map<p118h1.C2438c, p118h1.C2437b.d> f10889c;

    /* renamed from: d */
    public final android.util.SparseBooleanArray f10890d;

    /* renamed from: e */
    public final p118h1.C2437b.d f10891e;

    /* renamed from: h1.b$a */
    public static class a implements p118h1.C2437b.c {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p118h1.C2437b.c
        /* renamed from: a */
        public boolean mo6183a(int r5, float[] r6) {
                r4 = this;
                r5 = 2
                r0 = r6[r5]
                r1 = 1064514355(0x3f733333, float:0.95)
                r2 = 0
                r3 = 1
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                if (r0 != 0) goto L3e
                r5 = r6[r5]
                r0 = 1028443341(0x3d4ccccd, float:0.05)
                int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r5 > 0) goto L1c
                r5 = 1
                goto L1d
            L1c:
                r5 = 0
            L1d:
                if (r5 != 0) goto L3e
                r5 = r6[r2]
                r0 = 1092616192(0x41200000, float:10.0)
                int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r5 < 0) goto L3a
                r5 = r6[r2]
                r0 = 1108606976(0x42140000, float:37.0)
                int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r5 > 0) goto L3a
                r5 = r6[r3]
                r6 = 1062333317(0x3f51eb85, float:0.82)
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 > 0) goto L3a
                r5 = 1
                goto L3b
            L3a:
                r5 = 0
            L3b:
                if (r5 != 0) goto L3e
                r2 = 1
            L3e:
                return r2
        }
    }

    /* renamed from: h1.b$b */
    public static final class b {

        /* renamed from: a */
        public final android.graphics.Bitmap f10892a;

        /* renamed from: b */
        public final java.util.List<p118h1.C2438c> f10893b;

        /* renamed from: c */
        public int f10894c;

        /* renamed from: d */
        public int f10895d;

        /* renamed from: e */
        public int f10896e;

        /* renamed from: f */
        public final java.util.List<p118h1.C2437b.c> f10897f;

        public b(android.graphics.Bitmap r4) {
                r3 = this;
                r3.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.f10893b = r0
                r1 = 16
                r3.f10894c = r1
                r1 = 12544(0x3100, float:1.7578E-41)
                r3.f10895d = r1
                r1 = -1
                r3.f10896e = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r3.f10897f = r1
                boolean r2 = r4.isRecycled()
                if (r2 != 0) goto L48
                h1.b$c r2 = p118h1.C2437b.f10886f
                r1.add(r2)
                r3.f10892a = r4
                h1.c r4 = p118h1.C2438c.f10907d
                r0.add(r4)
                h1.c r4 = p118h1.C2438c.f10908e
                r0.add(r4)
                h1.c r4 = p118h1.C2438c.f10909f
                r0.add(r4)
                h1.c r4 = p118h1.C2438c.f10910g
                r0.add(r4)
                h1.c r4 = p118h1.C2438c.f10911h
                r0.add(r4)
                h1.c r4 = p118h1.C2438c.f10912i
                r0.add(r4)
                return
            L48:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Bitmap is not valid"
                r4.<init>(r0)
                throw r4
        }

        /* renamed from: a */
        public p118h1.C2437b m6184a() {
                r20 = this;
                r0 = r20
                android.graphics.Bitmap r1 = r0.f10892a
                if (r1 == 0) goto L1b8
                int r2 = r0.f10895d
                r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                if (r2 <= 0) goto L22
                int r2 = r1.getWidth()
                int r5 = r1.getHeight()
                int r5 = r5 * r2
                int r2 = r0.f10895d
                if (r5 <= r2) goto L39
                double r2 = (double) r2
                double r4 = (double) r5
                double r2 = r2 / r4
                double r3 = java.lang.Math.sqrt(r2)
                goto L39
            L22:
                int r2 = r0.f10896e
                if (r2 <= 0) goto L39
                int r2 = r1.getWidth()
                int r5 = r1.getHeight()
                int r2 = java.lang.Math.max(r2, r5)
                int r5 = r0.f10896e
                if (r2 <= r5) goto L39
                double r3 = (double) r5
                double r5 = (double) r2
                double r3 = r3 / r5
            L39:
                r5 = 0
                r2 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 > 0) goto L41
                goto L5d
            L41:
                int r5 = r1.getWidth()
                double r5 = (double) r5
                double r5 = r5 * r3
                double r5 = java.lang.Math.ceil(r5)
                int r5 = (int) r5
                int r6 = r1.getHeight()
                double r6 = (double) r6
                double r6 = r6 * r3
                double r3 = java.lang.Math.ceil(r6)
                int r3 = (int) r3
                android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r1, r5, r3, r2)
            L5d:
                android.graphics.Bitmap r3 = r0.f10892a
                h1.a r11 = new h1.a
                int r9 = r1.getWidth()
                int r10 = r1.getHeight()
                int r3 = r9 * r10
                int[] r12 = new int[r3]
                r5 = 0
                r7 = 0
                r8 = 0
                r3 = r1
                r4 = r12
                r6 = r9
                r3.getPixels(r4, r5, r6, r7, r8, r9, r10)
                int r3 = r0.f10894c
                java.util.List<h1.b$c> r4 = r0.f10897f
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L82
                r4 = 0
                goto L90
            L82:
                java.util.List<h1.b$c> r4 = r0.f10897f
                int r6 = r4.size()
                h1.b$c[] r6 = new p118h1.C2437b.c[r6]
                java.lang.Object[] r4 = r4.toArray(r6)
                h1.b$c[] r4 = (p118h1.C2437b.c[]) r4
            L90:
                r11.<init>(r12, r3, r4)
                android.graphics.Bitmap r3 = r0.f10892a
                if (r1 == r3) goto L9a
                r1.recycle()
            L9a:
                java.util.List<h1.b$d> r1 = r11.f10873c
                h1.b r3 = new h1.b
                java.util.List<h1.c> r4 = r0.f10893b
                r3.<init>(r1, r4)
                int r1 = r4.size()
                r4 = 0
            La8:
                if (r4 >= r1) goto L1b2
                java.util.List<h1.c> r6 = r3.f10888b
                java.lang.Object r6 = r6.get(r4)
                h1.c r6 = (p118h1.C2438c) r6
                float[] r7 = r6.f10915c
                int r7 = r7.length
                r8 = 0
                r9 = 0
                r10 = 0
            Lb8:
                if (r9 >= r7) goto Lc6
                float[] r11 = r6.f10915c
                r11 = r11[r9]
                int r12 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r12 <= 0) goto Lc3
                float r10 = r10 + r11
            Lc3:
                int r9 = r9 + 1
                goto Lb8
            Lc6:
                int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r7 == 0) goto Le0
                float[] r7 = r6.f10915c
                int r7 = r7.length
                r9 = 0
            Lce:
                if (r9 >= r7) goto Le0
                float[] r11 = r6.f10915c
                r12 = r11[r9]
                int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                if (r12 <= 0) goto Ldd
                r12 = r11[r9]
                float r12 = r12 / r10
                r11[r9] = r12
            Ldd:
                int r9 = r9 + 1
                goto Lce
            Le0:
                java.util.Map<h1.c, h1.b$d> r7 = r3.f10889c
                java.util.List<h1.b$d> r9 = r3.f10887a
                int r9 = r9.size()
                r10 = 0
                r11 = 0
                r12 = 0
            Leb:
                r13 = 1
                if (r10 >= r9) goto L1a0
                java.util.List<h1.b$d> r14 = r3.f10887a
                java.lang.Object r14 = r14.get(r10)
                h1.b$d r14 = (p118h1.C2437b.d) r14
                float[] r15 = r14.m6186b()
                r16 = r15[r13]
                float[] r5 = r6.f10913a
                r17 = r5[r2]
                r18 = 2
                int r16 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
                if (r16 < 0) goto L12c
                r16 = r15[r13]
                r5 = r5[r18]
                int r5 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
                if (r5 > 0) goto L12c
                r5 = r15[r18]
                float[] r13 = r6.f10914b
                r17 = r13[r2]
                int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
                if (r5 < 0) goto L12c
                r5 = r15[r18]
                r13 = r13[r18]
                int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
                if (r5 > 0) goto L12c
                android.util.SparseBooleanArray r5 = r3.f10890d
                int r13 = r14.f10901d
                boolean r5 = r5.get(r13)
                if (r5 != 0) goto L12c
                r5 = 1
                goto L12d
            L12c:
                r5 = 0
            L12d:
                if (r5 == 0) goto L199
                float[] r5 = r14.m6186b()
                h1.b$d r13 = r3.f10891e
                if (r13 == 0) goto L13a
                int r13 = r13.f10902e
                goto L13b
            L13a:
                r13 = 1
            L13b:
                float[] r15 = r6.f10915c
                r17 = r15[r2]
                r19 = 1065353216(0x3f800000, float:1.0)
                int r17 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
                if (r17 <= 0) goto L15a
                r15 = r15[r2]
                r16 = 1
                r17 = r5[r16]
                float[] r2 = r6.f10913a
                r2 = r2[r16]
                float r17 = r17 - r2
                float r2 = java.lang.Math.abs(r17)
                float r2 = r19 - r2
                float r2 = r2 * r15
                goto L15d
            L15a:
                r16 = 1
                r2 = 0
            L15d:
                float[] r15 = r6.f10915c
                r17 = r15[r16]
                int r17 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
                if (r17 <= 0) goto L177
                r15 = r15[r16]
                r5 = r5[r18]
                float[] r8 = r6.f10914b
                r8 = r8[r16]
                float r5 = r5 - r8
                float r5 = java.lang.Math.abs(r5)
                float r19 = r19 - r5
                float r19 = r19 * r15
                goto L179
            L177:
                r19 = 0
            L179:
                float[] r5 = r6.f10915c
                r8 = r5[r18]
                r15 = 0
                int r8 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
                if (r8 <= 0) goto L18c
                r5 = r5[r18]
                int r8 = r14.f10902e
                float r8 = (float) r8
                float r13 = (float) r13
                float r8 = r8 / r13
                float r8 = r8 * r5
                goto L18d
            L18c:
                r8 = 0
            L18d:
                float r2 = r2 + r19
                float r2 = r2 + r8
                if (r11 == 0) goto L196
                int r5 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
                if (r5 <= 0) goto L19a
            L196:
                r12 = r2
                r11 = r14
                goto L19a
            L199:
                r15 = 0
            L19a:
                int r10 = r10 + 1
                r2 = 0
                r8 = 0
                goto Leb
            L1a0:
                if (r11 == 0) goto L1aa
                android.util.SparseBooleanArray r2 = r3.f10890d
                int r5 = r11.f10901d
                r8 = 1
                r2.append(r5, r8)
            L1aa:
                r7.put(r6, r11)
                int r4 = r4 + 1
                r2 = 0
                goto La8
            L1b2:
                android.util.SparseBooleanArray r1 = r3.f10890d
                r1.clear()
                return r3
            L1b8:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }
    }

    /* renamed from: h1.b$c */
    public interface c {
        /* renamed from: a */
        boolean mo6183a(int r1, float[] r2);
    }

    /* renamed from: h1.b$d */
    public static final class d {

        /* renamed from: a */
        public final int f10898a;

        /* renamed from: b */
        public final int f10899b;

        /* renamed from: c */
        public final int f10900c;

        /* renamed from: d */
        public final int f10901d;

        /* renamed from: e */
        public final int f10902e;

        /* renamed from: f */
        public boolean f10903f;

        /* renamed from: g */
        public int f10904g;

        /* renamed from: h */
        public int f10905h;

        /* renamed from: i */
        public float[] f10906i;

        public d(int r2, int r3) {
                r1 = this;
                r1.<init>()
                int r0 = android.graphics.Color.red(r2)
                r1.f10898a = r0
                int r0 = android.graphics.Color.green(r2)
                r1.f10899b = r0
                int r0 = android.graphics.Color.blue(r2)
                r1.f10900c = r0
                r1.f10901d = r2
                r1.f10902e = r3
                return
        }

        /* renamed from: a */
        public final void m6185a() {
                r8 = this;
                boolean r0 = r8.f10903f
                if (r0 != 0) goto L62
                int r0 = r8.f10901d
                r1 = -1
                r2 = 1083179008(0x40900000, float:4.5)
                int r0 = p084f0.C1938a.m4820e(r1, r0, r2)
                int r3 = r8.f10901d
                r4 = 1077936128(0x40400000, float:3.0)
                int r3 = p084f0.C1938a.m4820e(r1, r3, r4)
                r5 = 1
                if (r0 == r1) goto L29
                if (r3 == r1) goto L29
                int r0 = p084f0.C1938a.m4825j(r1, r0)
                r8.f10905h = r0
                int r0 = p084f0.C1938a.m4825j(r1, r3)
            L24:
                r8.f10904g = r0
                r8.f10903f = r5
                return
            L29:
                int r6 = r8.f10901d
                r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                int r2 = p084f0.C1938a.m4820e(r7, r6, r2)
                int r6 = r8.f10901d
                int r4 = p084f0.C1938a.m4820e(r7, r6, r4)
                if (r2 == r1) goto L46
                if (r4 == r1) goto L46
                int r0 = p084f0.C1938a.m4825j(r7, r2)
                r8.f10905h = r0
                int r0 = p084f0.C1938a.m4825j(r7, r4)
                goto L24
            L46:
                if (r0 == r1) goto L4d
                int r0 = p084f0.C1938a.m4825j(r1, r0)
                goto L51
            L4d:
                int r0 = p084f0.C1938a.m4825j(r7, r2)
            L51:
                r8.f10905h = r0
                if (r3 == r1) goto L5a
                int r0 = p084f0.C1938a.m4825j(r1, r3)
                goto L5e
            L5a:
                int r0 = p084f0.C1938a.m4825j(r7, r4)
            L5e:
                r8.f10904g = r0
                r8.f10903f = r5
            L62:
                return
        }

        /* renamed from: b */
        public float[] m6186b() {
                r4 = this;
                float[] r0 = r4.f10906i
                if (r0 != 0) goto L9
                r0 = 3
                float[] r0 = new float[r0]
                r4.f10906i = r0
            L9:
                int r0 = r4.f10898a
                int r1 = r4.f10899b
                int r2 = r4.f10900c
                float[] r3 = r4.f10906i
                p084f0.C1938a.m4816a(r0, r1, r2, r3)
                float[] r0 = r4.f10906i
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L21
                java.lang.Class<h1.b$d> r2 = p118h1.C2437b.d.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L21
            L10:
                h1.b$d r5 = (p118h1.C2437b.d) r5
                int r2 = r4.f10902e
                int r3 = r5.f10902e
                if (r2 != r3) goto L1f
                int r2 = r4.f10901d
                int r5 = r5.f10901d
                if (r2 != r5) goto L1f
                goto L20
            L1f:
                r0 = 0
            L20:
                return r0
            L21:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.f10901d
                int r0 = r0 * 31
                int r1 = r2.f10902e
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.Class<h1.b$d> r1 = p118h1.C2437b.d.class
                java.lang.String r1 = r1.getSimpleName()
                r0.<init>(r1)
                java.lang.String r1 = " [RGB: #"
                r0.append(r1)
                int r1 = r3.f10901d
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r2 = " [HSL: "
                r0.append(r2)
                float[] r2 = r3.m6186b()
                java.lang.String r2 = java.util.Arrays.toString(r2)
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = " [Population: "
                r0.append(r2)
                int r2 = r3.f10902e
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = " [Title Text: #"
                r0.append(r2)
                r3.m6185a()
                int r2 = r3.f10904g
                java.lang.String r2 = java.lang.Integer.toHexString(r2)
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = " [Body Text: #"
                r0.append(r2)
                r3.m6185a()
                int r2 = r3.f10905h
                java.lang.String r2 = java.lang.Integer.toHexString(r2)
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            h1.b$a r0 = new h1.b$a
            r0.<init>()
            p118h1.C2437b.f10886f = r0
            return
    }

    public C2437b(java.util.List<p118h1.C2437b.d> r5, java.util.List<p118h1.C2438c> r6) {
            r4 = this;
            r4.<init>()
            r4.f10887a = r5
            r4.f10888b = r6
            android.util.SparseBooleanArray r6 = new android.util.SparseBooleanArray
            r6.<init>()
            r4.f10890d = r6
            s.a r6 = new s.a
            r6.<init>()
            r4.f10889c = r6
            int r5 = r5.size()
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = 0
            r1 = 0
        L1d:
            if (r1 >= r5) goto L30
            java.util.List<h1.b$d> r2 = r4.f10887a
            java.lang.Object r2 = r2.get(r1)
            h1.b$d r2 = (p118h1.C2437b.d) r2
            int r3 = r2.f10902e
            if (r3 <= r6) goto L2d
            r0 = r2
            r6 = r3
        L2d:
            int r1 = r1 + 1
            goto L1d
        L30:
            r4.f10891e = r0
            return
    }

    /* renamed from: a */
    public java.util.List<p118h1.C2437b.d> m6182a() {
            r1 = this;
            java.util.List<h1.b$d> r0 = r1.f10887a
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }
}
