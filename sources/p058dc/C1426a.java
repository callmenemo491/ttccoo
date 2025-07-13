package p058dc;

/* renamed from: dc.a */
/* loaded from: classes.dex */
public final class C1426a {

    /* renamed from: a */
    public final p453zb.C7270b f7108a;

    /* renamed from: b */
    public final p386w4.C6795b f7109b;

    /* renamed from: dc.a$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: dc.a$b */
    public static final class b {

        /* renamed from: a */
        public final sb.C6023q f7110a;

        /* renamed from: b */
        public final sb.C6023q f7111b;

        /* renamed from: c */
        public final int f7112c;

        public b(sb.C6023q r1, sb.C6023q r2, int r3, p058dc.C1426a.a r4) {
                r0 = this;
                r0.<init>()
                r0.f7110a = r1
                r0.f7111b = r2
                r0.f7112c = r3
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                sb.q r1 = r2.f7110a
                r0.append(r1)
                java.lang.String r1 = "/"
                r0.append(r1)
                sb.q r1 = r2.f7111b
                r0.append(r1)
                r1 = 47
                r0.append(r1)
                int r1 = r2.f7112c
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: dc.a$c */
    public static final class c implements java.io.Serializable, java.util.Comparator<p058dc.C1426a.b> {
        public c(p058dc.C1426a.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public int compare(p058dc.C1426a.b r1, p058dc.C1426a.b r2) {
                r0 = this;
                dc.a$b r1 = (p058dc.C1426a.b) r1
                dc.a$b r2 = (p058dc.C1426a.b) r2
                int r1 = r1.f7112c
                int r2 = r2.f7112c
                int r1 = r1 - r2
                return r1
        }
    }

    public C1426a(p453zb.C7270b r5) {
            r4 = this;
            r4.<init>()
            r4.f7108a = r5
            w4.b r0 = new w4.b
            int r1 = r5.f27902Y
            int r1 = r1 / 2
            int r2 = r5.f27903Z
            int r2 = r2 / 2
            r3 = 10
            r0.<init>(r5, r3, r1, r2)
            r4.f7109b = r0
            return
    }

    /* renamed from: a */
    public static int m3966a(sb.C6023q r2, sb.C6023q r3) {
            float r0 = r2.f23222a
            float r2 = r2.f23223b
            float r1 = r3.f23222a
            float r3 = r3.f23223b
            float r2 = p185k7.C4038x4.m9091d(r0, r2, r1, r3)
            int r2 = p185k7.C4038x4.m9099l(r2)
            return r2
    }

    /* renamed from: b */
    public static void m3967b(java.util.Map<sb.C6023q, java.lang.Integer> r2, sb.C6023q r3) {
            java.lang.Object r0 = r2.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 1
            if (r0 != 0) goto La
            goto Lf
        La:
            int r0 = r0.intValue()
            int r1 = r1 + r0
        Lf:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.put(r3, r0)
            return
    }

    /* renamed from: d */
    public static p453zb.C7270b m3968d(p453zb.C7270b r25, sb.C6023q r26, sb.C6023q r27, sb.C6023q r28, sb.C6023q r29, int r30, int r31) {
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            zb.f r6 = p453zb.C7274f.f27924a
            float r7 = (float) r4
            r8 = 1056964608(0x3f000000, float:0.5)
            float r13 = r7 - r8
            float r7 = (float) r5
            float r16 = r7 - r8
            float r7 = r0.f23222a
            float r0 = r0.f23223b
            float r8 = r3.f23222a
            float r3 = r3.f23223b
            float r15 = r2.f23222a
            float r2 = r2.f23223b
            float r14 = r1.f23222a
            float r1 = r1.f23223b
            r9 = 1056964608(0x3f000000, float:0.5)
            r10 = 1056964608(0x3f000000, float:0.5)
            r12 = 1056964608(0x3f000000, float:0.5)
            r17 = 1056964608(0x3f000000, float:0.5)
            r11 = r13
            r23 = r14
            r14 = r16
            r21 = r15
            r15 = r17
            r17 = r7
            r18 = r0
            r19 = r8
            r20 = r3
            r22 = r2
            r24 = r1
            e0.b r0 = p065e0.C1497b.m4066c(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1 = r25
            zb.b r0 = r6.m14386a(r1, r4, r5, r0)
            return r0
    }

    /* renamed from: c */
    public final boolean m3969c(sb.C6023q r5) {
            r4 = this;
            float r0 = r5.f23222a
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 < 0) goto L1f
            zb.b r2 = r4.f7108a
            int r3 = r2.f27902Y
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L1f
            float r5 = r5.f23223b
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1f
            int r0 = r2.f27903Z
            float r0 = (float) r0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L1f
            r5 = 1
            return r5
        L1f:
            r5 = 0
            return r5
    }

    /* renamed from: e */
    public final p058dc.C1426a.b m3970e(sb.C6023q r20, sb.C6023q r21) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            float r3 = r1.f23222a
            int r3 = (int) r3
            float r4 = r1.f23223b
            int r4 = (int) r4
            float r5 = r2.f23222a
            int r5 = (int) r5
            float r6 = r2.f23223b
            int r6 = (int) r6
            int r7 = r6 - r4
            int r7 = java.lang.Math.abs(r7)
            int r8 = r5 - r3
            int r8 = java.lang.Math.abs(r8)
            r10 = 1
            if (r7 <= r8) goto L23
            r7 = 1
            goto L24
        L23:
            r7 = 0
        L24:
            if (r7 == 0) goto L30
            r17 = r4
            r4 = r3
            r3 = r17
            r18 = r6
            r6 = r5
            r5 = r18
        L30:
            int r8 = r5 - r3
            int r8 = java.lang.Math.abs(r8)
            int r11 = r6 - r4
            int r11 = java.lang.Math.abs(r11)
            int r12 = -r8
            int r12 = r12 / 2
            r13 = -1
            if (r4 >= r6) goto L44
            r14 = 1
            goto L45
        L44:
            r14 = -1
        L45:
            if (r3 >= r5) goto L48
            goto L49
        L48:
            r10 = -1
        L49:
            zb.b r13 = r0.f7108a
            if (r7 == 0) goto L4f
            r15 = r4
            goto L50
        L4f:
            r15 = r3
        L50:
            if (r7 == 0) goto L54
            r9 = r3
            goto L55
        L54:
            r9 = r4
        L55:
            boolean r9 = r13.m14372b(r15, r9)
            r16 = 0
        L5b:
            if (r3 == r5) goto L7d
            zb.b r13 = r0.f7108a
            if (r7 == 0) goto L63
            r15 = r4
            goto L64
        L63:
            r15 = r3
        L64:
            if (r7 == 0) goto L68
            r0 = r3
            goto L69
        L68:
            r0 = r4
        L69:
            boolean r0 = r13.m14372b(r15, r0)
            if (r0 == r9) goto L72
            int r16 = r16 + 1
            r9 = r0
        L72:
            int r12 = r12 + r11
            if (r12 <= 0) goto L79
            if (r4 == r6) goto L7d
            int r4 = r4 + r14
            int r12 = r12 - r8
        L79:
            int r3 = r3 + r10
            r0 = r19
            goto L5b
        L7d:
            r0 = r16
            dc.a$b r3 = new dc.a$b
            r4 = 0
            r3.<init>(r1, r2, r0, r4)
            return r3
    }
}
