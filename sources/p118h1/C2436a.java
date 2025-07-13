package p118h1;

/* renamed from: h1.a */
/* loaded from: classes.dex */
public final class C2436a {

    /* renamed from: f */
    public static final java.util.Comparator<p118h1.C2436a.b> f10870f = null;

    /* renamed from: a */
    public final int[] f10871a;

    /* renamed from: b */
    public final int[] f10872b;

    /* renamed from: c */
    public final java.util.List<p118h1.C2437b.d> f10873c;

    /* renamed from: d */
    public final p118h1.C2437b.c[] f10874d;

    /* renamed from: e */
    public final float[] f10875e;

    /* renamed from: h1.a$a */
    public static class a implements java.util.Comparator<p118h1.C2436a.b> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public int compare(p118h1.C2436a.b r1, p118h1.C2436a.b r2) {
                r0 = this;
                h1.a$b r1 = (p118h1.C2436a.b) r1
                h1.a$b r2 = (p118h1.C2436a.b) r2
                int r2 = r2.m6181b()
                int r1 = r1.m6181b()
                int r2 = r2 - r1
                return r2
        }
    }

    /* renamed from: h1.a$b */
    public class b {

        /* renamed from: a */
        public int f10876a;

        /* renamed from: b */
        public int f10877b;

        /* renamed from: c */
        public int f10878c;

        /* renamed from: d */
        public int f10879d;

        /* renamed from: e */
        public int f10880e;

        /* renamed from: f */
        public int f10881f;

        /* renamed from: g */
        public int f10882g;

        /* renamed from: h */
        public int f10883h;

        /* renamed from: i */
        public int f10884i;

        /* renamed from: j */
        public final /* synthetic */ p118h1.C2436a f10885j;

        public b(p118h1.C2436a r1, int r2, int r3) {
                r0 = this;
                r0.f10885j = r1
                r0.<init>()
                r0.f10876a = r2
                r0.f10877b = r3
                r0.m6180a()
                return
        }

        /* renamed from: a */
        public final void m6180a() {
                r13 = this;
                h1.a r0 = r13.f10885j
                int[] r1 = r0.f10871a
                int[] r0 = r0.f10872b
                int r2 = r13.f10876a
                r3 = 2147483647(0x7fffffff, float:NaN)
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = 0
                r4 = 2147483647(0x7fffffff, float:NaN)
                r5 = 2147483647(0x7fffffff, float:NaN)
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = -2147483648(0xffffffff80000000, float:-0.0)
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = 0
            L1b:
                int r10 = r13.f10877b
                if (r2 > r10) goto L43
                r10 = r1[r2]
                r11 = r0[r10]
                int r9 = r9 + r11
                int r11 = r10 >> 10
                r11 = r11 & 31
                int r12 = r10 >> 5
                r12 = r12 & 31
                r10 = r10 & 31
                if (r11 <= r6) goto L31
                r6 = r11
            L31:
                if (r11 >= r3) goto L34
                r3 = r11
            L34:
                if (r12 <= r7) goto L37
                r7 = r12
            L37:
                if (r12 >= r4) goto L3a
                r4 = r12
            L3a:
                if (r10 <= r8) goto L3d
                r8 = r10
            L3d:
                if (r10 >= r5) goto L40
                r5 = r10
            L40:
                int r2 = r2 + 1
                goto L1b
            L43:
                r13.f10879d = r3
                r13.f10880e = r6
                r13.f10881f = r4
                r13.f10882g = r7
                r13.f10883h = r5
                r13.f10884i = r8
                r13.f10878c = r9
                return
        }

        /* renamed from: b */
        public final int m6181b() {
                r3 = this;
                int r0 = r3.f10880e
                int r1 = r3.f10879d
                int r0 = r0 - r1
                int r0 = r0 + 1
                int r1 = r3.f10882g
                int r2 = r3.f10881f
                int r1 = r1 - r2
                int r1 = r1 + 1
                int r1 = r1 * r0
                int r0 = r3.f10884i
                int r2 = r3.f10883h
                int r0 = r0 - r2
                int r0 = r0 + 1
                int r0 = r0 * r1
                return r0
        }
    }

    static {
            h1.a$a r0 = new h1.a$a
            r0.<init>()
            p118h1.C2436a.f10870f = r0
            return
    }

    public C2436a(int[] r12, int r13, p118h1.C2437b.c[] r14) {
            r11 = this;
            r11.<init>()
            r0 = 3
            float[] r0 = new float[r0]
            r11.f10875e = r0
            r11.f10874d = r14
            r14 = 32768(0x8000, float:4.5918E-41)
            int[] r0 = new int[r14]
            r11.f10872b = r0
            r1 = 0
            r2 = 0
        L13:
            int r3 = r12.length
            r4 = 1
            if (r2 >= r3) goto L44
            r3 = r12[r2]
            int r5 = android.graphics.Color.red(r3)
            r6 = 8
            r7 = 5
            int r5 = m6178c(r5, r6, r7)
            int r8 = android.graphics.Color.green(r3)
            int r8 = m6178c(r8, r6, r7)
            int r3 = android.graphics.Color.blue(r3)
            int r3 = m6178c(r3, r6, r7)
            int r5 = r5 << 10
            int r6 = r8 << 5
            r5 = r5 | r6
            r3 = r3 | r5
            r12[r2] = r3
            r5 = r0[r3]
            int r5 = r5 + r4
            r0[r3] = r5
            int r2 = r2 + 1
            goto L13
        L44:
            r12 = 0
            r2 = 0
        L46:
            if (r12 >= r14) goto L80
            r3 = r0[r12]
            if (r3 <= 0) goto L77
            int r3 = r12 >> 10
            r3 = r3 & 31
            int r5 = r12 >> 5
            r5 = r5 & 31
            r6 = r12 & 31
            int r3 = m6176a(r3, r5, r6)
            float[] r5 = r11.f10875e
            java.lang.ThreadLocal<double[]> r6 = p084f0.C1938a.f8479a
            int r6 = android.graphics.Color.red(r3)
            int r7 = android.graphics.Color.green(r3)
            int r8 = android.graphics.Color.blue(r3)
            p084f0.C1938a.m4816a(r6, r7, r8, r5)
            float[] r5 = r11.f10875e
            boolean r3 = r11.m6179d(r3, r5)
            if (r3 == 0) goto L77
            r0[r12] = r1
        L77:
            r3 = r0[r12]
            if (r3 <= 0) goto L7d
            int r2 = r2 + 1
        L7d:
            int r12 = r12 + 1
            goto L46
        L80:
            int[] r12 = new int[r2]
            r11.f10871a = r12
            r3 = 0
            r5 = 0
        L86:
            if (r3 >= r14) goto L94
            r6 = r0[r3]
            if (r6 <= 0) goto L91
            int r6 = r5 + 1
            r12[r5] = r3
            r5 = r6
        L91:
            int r3 = r3 + 1
            goto L86
        L94:
            if (r2 > r13) goto Lbe
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r11.f10873c = r13
        L9d:
            if (r1 >= r2) goto L1d8
            r13 = r12[r1]
            java.util.List<h1.b$d> r14 = r11.f10873c
            h1.b$d r3 = new h1.b$d
            int r4 = r13 >> 10
            r4 = r4 & 31
            int r5 = r13 >> 5
            r5 = r5 & 31
            r6 = r13 & 31
            int r4 = m6176a(r4, r5, r6)
            r13 = r0[r13]
            r3.<init>(r4, r13)
            r14.add(r3)
            int r1 = r1 + 1
            goto L9d
        Lbe:
            java.util.PriorityQueue r12 = new java.util.PriorityQueue
            java.util.Comparator<h1.a$b> r14 = p118h1.C2436a.f10870f
            r12.<init>(r13, r14)
            h1.a$b r14 = new h1.a$b
            int[] r0 = r11.f10871a
            int r0 = r0.length
            int r0 = r0 - r4
            r14.<init>(r11, r1, r0)
            r12.offer(r14)
        Ld1:
            int r14 = r12.size()
            if (r14 >= r13) goto L166
            java.lang.Object r14 = r12.poll()
            h1.a$b r14 = (p118h1.C2436a.b) r14
            if (r14 == 0) goto L166
            int r0 = r14.f10877b
            int r2 = r0 + 1
            int r3 = r14.f10876a
            int r2 = r2 - r3
            if (r2 <= r4) goto Lea
            r5 = 1
            goto Leb
        Lea:
            r5 = 0
        Leb:
            if (r5 == 0) goto L166
            if (r2 <= r4) goto Lf1
            r2 = 1
            goto Lf2
        Lf1:
            r2 = 0
        Lf2:
            if (r2 == 0) goto L15e
            int r2 = r14.f10880e
            int r5 = r14.f10879d
            int r2 = r2 - r5
            int r5 = r14.f10882g
            int r6 = r14.f10881f
            int r5 = r5 - r6
            int r6 = r14.f10884i
            int r7 = r14.f10883h
            int r6 = r6 - r7
            if (r2 < r5) goto L109
            if (r2 < r6) goto L109
            r2 = -3
            goto L110
        L109:
            if (r5 < r2) goto L10f
            if (r5 < r6) goto L10f
            r2 = -2
            goto L110
        L10f:
            r2 = -1
        L110:
            h1.a r5 = r14.f10885j
            int[] r6 = r5.f10871a
            int[] r5 = r5.f10872b
            m6177b(r6, r2, r3, r0)
            int r0 = r14.f10876a
            int r3 = r14.f10877b
            int r3 = r3 + r4
            java.util.Arrays.sort(r6, r0, r3)
            int r0 = r14.f10876a
            int r3 = r14.f10877b
            m6177b(r6, r2, r0, r3)
            int r0 = r14.f10878c
            int r0 = r0 / 2
            int r2 = r14.f10876a
            r3 = 0
        L12f:
            int r7 = r14.f10877b
            if (r2 > r7) goto L144
            r8 = r6[r2]
            r8 = r5[r8]
            int r3 = r3 + r8
            if (r3 < r0) goto L141
            int r7 = r7 + (-1)
            int r0 = java.lang.Math.min(r7, r2)
            goto L146
        L141:
            int r2 = r2 + 1
            goto L12f
        L144:
            int r0 = r14.f10876a
        L146:
            h1.a$b r2 = new h1.a$b
            h1.a r3 = r14.f10885j
            int r5 = r0 + 1
            int r6 = r14.f10877b
            r2.<init>(r3, r5, r6)
            r14.f10877b = r0
            r14.m6180a()
            r12.offer(r2)
            r12.offer(r14)
            goto Ld1
        L15e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Can not split a box with only 1 color"
            r12.<init>(r13)
            throw r12
        L166:
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = r12.size()
            r13.<init>(r14)
            java.util.Iterator r12 = r12.iterator()
        L173:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L1d6
            java.lang.Object r14 = r12.next()
            h1.a$b r14 = (p118h1.C2436a.b) r14
            h1.a r0 = r14.f10885j
            int[] r2 = r0.f10871a
            int[] r0 = r0.f10872b
            int r3 = r14.f10876a
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L18b:
            int r8 = r14.f10877b
            if (r3 > r8) goto L1aa
            r8 = r2[r3]
            r9 = r0[r8]
            int r5 = r5 + r9
            int r10 = r8 >> 10
            r10 = r10 & 31
            int r10 = r10 * r9
            int r4 = r4 + r10
            int r10 = r8 >> 5
            r10 = r10 & 31
            int r10 = r10 * r9
            int r6 = r6 + r10
            r8 = r8 & 31
            int r9 = r9 * r8
            int r7 = r7 + r9
            int r3 = r3 + 1
            goto L18b
        L1aa:
            float r14 = (float) r4
            float r0 = (float) r5
            float r14 = r14 / r0
            int r14 = java.lang.Math.round(r14)
            float r2 = (float) r6
            float r2 = r2 / r0
            int r2 = java.lang.Math.round(r2)
            float r3 = (float) r7
            float r3 = r3 / r0
            int r0 = java.lang.Math.round(r3)
            h1.b$d r3 = new h1.b$d
            int r14 = m6176a(r14, r2, r0)
            r3.<init>(r14, r5)
            int r14 = r3.f10901d
            float[] r0 = r3.m6186b()
            boolean r14 = r11.m6179d(r14, r0)
            if (r14 != 0) goto L173
            r13.add(r3)
            goto L173
        L1d6:
            r11.f10873c = r13
        L1d8:
            return
    }

    /* renamed from: a */
    public static int m6176a(int r2, int r3, int r4) {
            r0 = 5
            r1 = 8
            int r2 = m6178c(r2, r0, r1)
            int r3 = m6178c(r3, r0, r1)
            int r4 = m6178c(r4, r0, r1)
            int r2 = android.graphics.Color.rgb(r2, r3, r4)
            return r2
    }

    /* renamed from: b */
    public static void m6177b(int[] r2, int r3, int r4, int r5) {
            r0 = -2
            if (r3 == r0) goto L20
            r0 = -1
            if (r3 == r0) goto L7
            goto L39
        L7:
            if (r4 > r5) goto L39
            r3 = r2[r4]
            r0 = r3 & 31
            int r0 = r0 << 10
            int r1 = r3 >> 5
            r1 = r1 & 31
            int r1 = r1 << 5
            r0 = r0 | r1
            int r3 = r3 >> 10
            r3 = r3 & 31
            r3 = r3 | r0
            r2[r4] = r3
            int r4 = r4 + 1
            goto L7
        L20:
            if (r4 > r5) goto L39
            r3 = r2[r4]
            int r0 = r3 >> 5
            r0 = r0 & 31
            int r0 = r0 << 10
            int r1 = r3 >> 10
            r1 = r1 & 31
            int r1 = r1 << 5
            r0 = r0 | r1
            r3 = r3 & 31
            r3 = r3 | r0
            r2[r4] = r3
            int r4 = r4 + 1
            goto L20
        L39:
            return
    }

    /* renamed from: c */
    public static int m6178c(int r0, int r1, int r2) {
            if (r2 <= r1) goto L6
            int r1 = r2 - r1
            int r0 = r0 << r1
            goto L8
        L6:
            int r1 = r1 - r2
            int r0 = r0 >> r1
        L8:
            r1 = 1
            int r2 = r1 << r2
            int r2 = r2 - r1
            r0 = r0 & r2
            return r0
    }

    /* renamed from: d */
    public final boolean m6179d(int r5, float[] r6) {
            r4 = this;
            h1.b$c[] r0 = r4.f10874d
            r1 = 0
            if (r0 == 0) goto L1b
            int r2 = r0.length
            if (r2 <= 0) goto L1b
            int r0 = r0.length
            r2 = 0
        La:
            if (r2 >= r0) goto L1b
            h1.b$c[] r3 = r4.f10874d
            r3 = r3[r2]
            boolean r3 = r3.mo6183a(r5, r6)
            if (r3 != 0) goto L18
            r5 = 1
            return r5
        L18:
            int r2 = r2 + 1
            goto La
        L1b:
            return r1
    }
}
