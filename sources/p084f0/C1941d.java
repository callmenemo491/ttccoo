package p084f0;

/* renamed from: f0.d */
/* loaded from: classes.dex */
public class C1941d {

    /* renamed from: f0.d$a */
    public static class a {

        /* renamed from: a */
        public char f8485a;

        /* renamed from: b */
        public float[] f8486b;

        public a(char r1, float[] r2) {
                r0 = this;
                r0.<init>()
                r0.f8485a = r1
                r0.f8486b = r2
                return
        }

        public a(p084f0.C1941d.a r3) {
                r2 = this;
                r2.<init>()
                char r0 = r3.f8485a
                r2.f8485a = r0
                float[] r3 = r3.f8486b
                int r0 = r3.length
                r1 = 0
                float[] r3 = p084f0.C1941d.m4831b(r3, r1, r0)
                r2.f8486b = r3
                return
        }

        /* renamed from: a */
        public static void m4835a(android.graphics.Path r51, float r52, float r53, float r54, float r55, float r56, float r57, float r58, boolean r59, boolean r60) {
                r1 = r52
                r3 = r54
                r0 = r56
                r2 = r57
                r7 = r58
                r9 = r60
                double r4 = (double) r7
                double r4 = java.lang.Math.toRadians(r4)
                double r10 = java.lang.Math.cos(r4)
                double r12 = java.lang.Math.sin(r4)
                double r14 = (double) r1
                double r16 = r14 * r10
                r6 = r53
                double r7 = (double) r6
                double r18 = r7 * r12
                double r18 = r18 + r16
                r16 = r14
                double r14 = (double) r0
                double r18 = r18 / r14
                float r6 = -r1
                r20 = r4
                double r4 = (double) r6
                double r4 = r4 * r12
                double r22 = r7 * r10
                double r22 = r22 + r4
                double r4 = (double) r2
                double r22 = r22 / r4
                r24 = r7
                double r6 = (double) r3
                double r6 = r6 * r10
                r8 = r55
                double r1 = (double) r8
                double r26 = r1 * r12
                double r26 = r26 + r6
                double r26 = r26 / r14
                float r6 = -r3
                double r6 = (double) r6
                double r6 = r6 * r12
                double r1 = r1 * r10
                double r1 = r1 + r6
                double r1 = r1 / r4
                double r6 = r18 - r26
                double r28 = r22 - r1
                double r30 = r18 + r26
                r32 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r30 = r30 / r32
                double r34 = r22 + r1
                double r34 = r34 / r32
                double r36 = r6 * r6
                double r38 = r28 * r28
                r40 = r12
                double r12 = r38 + r36
                java.lang.String r3 = "PathParser"
                r36 = 0
                int r38 = (r12 > r36 ? 1 : (r12 == r36 ? 0 : -1))
                if (r38 != 0) goto L6f
                java.lang.String r0 = " Points are coincident"
                android.util.Log.w(r3, r0)
                return
            L6f:
                r38 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r42 = r38 / r12
                r44 = 4598175219545276416(0x3fd0000000000000, double:0.25)
                double r42 = r42 - r44
                int r44 = (r42 > r36 ? 1 : (r42 == r36 ? 0 : -1))
                if (r44 >= 0) goto Lb2
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Points are too far apart "
                r1.append(r2)
                r1.append(r12)
                java.lang.String r1 = r1.toString()
                android.util.Log.w(r3, r1)
                double r1 = java.lang.Math.sqrt(r12)
                r3 = 4611685973391391630(0x3ffffff583a53b8e, double:1.99999)
                double r1 = r1 / r3
                float r1 = (float) r1
                float r5 = r0 * r1
                float r6 = r57 * r1
                r0 = r51
                r1 = r52
                r2 = r53
                r3 = r54
                r4 = r55
                r7 = r58
                r8 = r59
                r9 = r60
                m4835a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
            Lb2:
                double r12 = java.lang.Math.sqrt(r42)
                double r6 = r6 * r12
                double r12 = r12 * r28
                r0 = r59
                if (r0 != r9) goto Lc3
                double r30 = r30 - r12
                double r34 = r34 + r6
                goto Lc7
            Lc3:
                double r30 = r30 + r12
                double r34 = r34 - r6
            Lc7:
                double r6 = r22 - r34
                double r12 = r18 - r30
                double r6 = java.lang.Math.atan2(r6, r12)
                double r1 = r1 - r34
                double r12 = r26 - r30
                double r0 = java.lang.Math.atan2(r1, r12)
                double r0 = r0 - r6
                r2 = 0
                int r3 = (r0 > r36 ? 1 : (r0 == r36 ? 0 : -1))
                if (r3 < 0) goto Ldf
                r8 = 1
                goto Le0
            Ldf:
                r8 = 0
            Le0:
                if (r9 == r8) goto Lec
                r8 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
                if (r3 <= 0) goto Leb
                double r0 = r0 - r8
                goto Lec
            Leb:
                double r0 = r0 + r8
            Lec:
                double r30 = r30 * r14
                double r34 = r34 * r4
                double r8 = r30 * r10
                double r12 = r34 * r40
                double r8 = r8 - r12
                double r30 = r30 * r40
                double r34 = r34 * r10
                double r34 = r34 + r30
                r10 = 4616189618054758400(0x4010000000000000, double:4.0)
                double r12 = r0 * r10
                r18 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
                double r12 = r12 / r18
                double r12 = java.lang.Math.abs(r12)
                double r12 = java.lang.Math.ceil(r12)
                int r3 = (int) r12
                double r12 = java.lang.Math.cos(r20)
                double r18 = java.lang.Math.sin(r20)
                double r20 = java.lang.Math.cos(r6)
                double r22 = java.lang.Math.sin(r6)
                double r10 = -r14
                double r26 = r10 * r12
                double r28 = r26 * r22
                double r30 = r4 * r18
                double r36 = r30 * r20
                double r28 = r28 - r36
                double r10 = r10 * r18
                double r22 = r22 * r10
                double r4 = r4 * r12
                double r20 = r20 * r4
                double r20 = r20 + r22
                r54 = r6
                double r6 = (double) r3
                double r0 = r0 / r6
                r6 = r54
            L13a:
                if (r2 >= r3) goto L1dd
                double r22 = r6 + r0
                double r36 = java.lang.Math.sin(r22)
                double r40 = java.lang.Math.cos(r22)
                double r42 = r14 * r12
                double r42 = r42 * r40
                double r42 = r42 + r8
                double r44 = r30 * r36
                r54 = r0
                double r0 = r42 - r44
                double r42 = r14 * r18
                double r42 = r42 * r40
                double r42 = r42 + r34
                double r44 = r4 * r36
                r56 = r8
                double r8 = r44 + r42
                double r42 = r26 * r36
                double r44 = r30 * r40
                double r42 = r42 - r44
                double r36 = r36 * r10
                double r40 = r40 * r4
                double r36 = r40 + r36
                double r6 = r22 - r6
                double r40 = r6 / r32
                double r40 = java.lang.Math.tan(r40)
                double r6 = java.lang.Math.sin(r6)
                r44 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r46 = r40 * r44
                double r46 = r46 * r40
                r40 = 4616189618054758400(0x4010000000000000, double:4.0)
                double r46 = r46 + r40
                double r46 = java.lang.Math.sqrt(r46)
                double r46 = r46 - r38
                double r46 = r46 * r6
                double r46 = r46 / r44
                double r28 = r28 * r46
                double r6 = r28 + r16
                double r20 = r20 * r46
                r16 = r3
                r52 = r4
                double r3 = r20 + r24
                double r20 = r46 * r42
                r58 = r10
                double r10 = r0 - r20
                double r46 = r46 * r36
                r20 = r12
                double r12 = r8 - r46
                r5 = 0
                r24 = r14
                r14 = r51
                r14.rLineTo(r5, r5)
                float r5 = (float) r6
                float r3 = (float) r3
                float r4 = (float) r10
                float r6 = (float) r12
                float r7 = (float) r0
                float r10 = (float) r8
                r44 = r51
                r45 = r5
                r46 = r3
                r47 = r4
                r48 = r6
                r49 = r7
                r50 = r10
                r44.cubicTo(r45, r46, r47, r48, r49, r50)
                int r2 = r2 + 1
                r4 = r52
                r10 = r58
                r3 = r16
                r12 = r20
                r6 = r22
                r14 = r24
                r20 = r36
                r28 = r42
                r16 = r0
                r24 = r8
                r0 = r54
                r8 = r56
                goto L13a
            L1dd:
                return
        }

        /* renamed from: b */
        public static void m4836b(p084f0.C1941d.a[] r30, android.graphics.Path r31) {
                r0 = r30
                r11 = r31
                r12 = 6
                float[] r13 = new float[r12]
                r14 = 109(0x6d, float:1.53E-43)
                r15 = 0
                r1 = 109(0x6d, float:1.53E-43)
                r10 = 0
            Ld:
                int r2 = r0.length
                if (r10 >= r2) goto L3d5
                r2 = r0[r10]
                char r9 = r2.f8485a
                r2 = r0[r10]
                float[] r8 = r2.f8486b
                r2 = r13[r15]
                r16 = 1
                r3 = r13[r16]
                r17 = 2
                r4 = r13[r17]
                r18 = 3
                r5 = r13[r18]
                r19 = 4
                r6 = r13[r19]
                r20 = 5
                r7 = r13[r20]
                switch(r9) {
                    case 65: goto L46;
                    case 67: goto L43;
                    case 72: goto L40;
                    case 81: goto L3d;
                    case 83: goto L3d;
                    case 86: goto L40;
                    case 90: goto L32;
                    case 97: goto L46;
                    case 99: goto L43;
                    case 104: goto L40;
                    case 113: goto L3d;
                    case 115: goto L3d;
                    case 118: goto L40;
                    case 122: goto L32;
                    default: goto L31;
                }
            L31:
                goto L49
            L32:
                r31.close()
                r11.moveTo(r6, r7)
                r2 = r6
                r4 = r2
                r3 = r7
                r5 = r3
                goto L49
            L3d:
                r21 = 4
                goto L4b
            L40:
                r21 = 1
                goto L4b
            L43:
                r21 = 6
                goto L4b
            L46:
                r21 = 7
                goto L4b
            L49:
                r21 = 2
            L4b:
                r22 = r6
                r23 = r7
                r7 = r2
                r6 = r3
                r3 = 0
            L52:
                int r2 = r8.length
                if (r3 >= r2) goto L3b5
                r2 = 65
                if (r9 == r2) goto L360
                r2 = 67
                if (r9 == r2) goto L32d
                r15 = 72
                if (r9 == r15) goto L319
                r15 = 81
                if (r9 == r15) goto L2f3
                r12 = 86
                if (r9 == r12) goto L2df
                r12 = 97
                if (r9 == r12) goto L28b
                r12 = 99
                if (r9 == r12) goto L24f
                r2 = 104(0x68, float:1.46E-43)
                if (r9 == r2) goto L23e
                r2 = 113(0x71, float:1.58E-43)
                if (r9 == r2) goto L219
                r12 = 118(0x76, float:1.65E-43)
                if (r9 == r12) goto L206
                r12 = 76
                if (r9 == r12) goto L1f1
                r12 = 77
                if (r9 == r12) goto L1c9
                r12 = 115(0x73, float:1.61E-43)
                r27 = 1073741824(0x40000000, float:2.0)
                r15 = 83
                if (r9 == r15) goto L18a
                r15 = 116(0x74, float:1.63E-43)
                r2 = 84
                if (r9 == r2) goto L153
                r2 = 108(0x6c, float:1.51E-43)
                if (r9 == r2) goto L13c
                if (r9 == r14) goto L114
                if (r9 == r12) goto Lcd
                if (r9 == r15) goto L9e
                goto Lc9
            L9e:
                r2 = 113(0x71, float:1.58E-43)
                if (r1 == r2) goto Lb0
                if (r1 == r15) goto Lb0
                r2 = 81
                if (r1 == r2) goto Lb0
                r2 = 84
                if (r1 != r2) goto Lad
                goto Lb0
            Lad:
                r1 = 0
                r12 = 0
                goto Lb4
            Lb0:
                float r12 = r7 - r4
                float r1 = r6 - r5
            Lb4:
                int r2 = r3 + 0
                r4 = r8[r2]
                int r5 = r3 + 1
                r15 = r8[r5]
                r11.rQuadTo(r12, r1, r4, r15)
                float r12 = r12 + r7
                float r1 = r1 + r6
                r2 = r8[r2]
                float r7 = r7 + r2
                r2 = r8[r5]
                float r6 = r6 + r2
                r5 = r1
                r4 = r12
            Lc9:
                r29 = r3
                goto L283
            Lcd:
                r2 = 99
                if (r1 == r2) goto Le0
                if (r1 == r12) goto Le0
                r2 = 67
                if (r1 == r2) goto Le0
                r2 = 83
                if (r1 != r2) goto Ldc
                goto Le0
            Ldc:
                r2 = 0
                r24 = 0
                goto Le7
            Le0:
                float r1 = r7 - r4
                float r2 = r6 - r5
                r24 = r2
                r2 = r1
            Le7:
                int r12 = r3 + 0
                r4 = r8[r12]
                int r15 = r3 + 1
                r5 = r8[r15]
                int r25 = r3 + 2
                r26 = r8[r25]
                int r27 = r3 + 3
                r28 = r8[r27]
                r1 = r31
                r29 = r3
                r3 = r24
                r14 = r6
                r6 = r26
                r0 = r7
                r7 = r28
                r1.rCubicTo(r2, r3, r4, r5, r6, r7)
                r1 = r8[r12]
                float r1 = r1 + r0
                r2 = r8[r15]
                float r2 = r2 + r14
                r3 = r8[r25]
                float r7 = r0 + r3
                r0 = r8[r27]
                goto L27c
            L114:
                r29 = r3
                r14 = r6
                r0 = r7
                int r3 = r29 + 0
                r1 = r8[r3]
                float r7 = r0 + r1
                int r0 = r29 + 1
                r1 = r8[r0]
                float r6 = r14 + r1
                if (r29 <= 0) goto L12f
                r1 = r8[r3]
                r0 = r8[r0]
                r11.rLineTo(r1, r0)
                goto L283
            L12f:
                r1 = r8[r3]
                r0 = r8[r0]
                r11.rMoveTo(r1, r0)
                r23 = r6
                r22 = r7
                goto L1eb
            L13c:
                r29 = r3
                r14 = r6
                r0 = r7
                int r3 = r29 + 0
                r1 = r8[r3]
                int r2 = r29 + 1
                r6 = r8[r2]
                r11.rLineTo(r1, r6)
                r1 = r8[r3]
                float r7 = r0 + r1
                r0 = r8[r2]
                goto L215
            L153:
                r29 = r3
                r14 = r6
                r0 = r7
                r2 = 113(0x71, float:1.58E-43)
                if (r1 == r2) goto L169
                if (r1 == r15) goto L169
                r2 = 81
                if (r1 == r2) goto L169
                r2 = 84
                if (r1 != r2) goto L166
                goto L169
            L166:
                r7 = r0
                r6 = r14
                goto L16f
            L169:
                float r7 = r0 * r27
                float r7 = r7 - r4
                float r6 = r14 * r27
                float r6 = r6 - r5
            L16f:
                int r3 = r29 + 0
                r0 = r8[r3]
                int r1 = r29 + 1
                r2 = r8[r1]
                r11.quadTo(r7, r6, r0, r2)
                r0 = r8[r3]
                r1 = r8[r1]
                r5 = r6
                r4 = r7
                r27 = r8
                r25 = r9
                r28 = r10
                r7 = r0
                r6 = r1
                goto L3a4
            L18a:
                r29 = r3
                r14 = r6
                r0 = r7
                r2 = 99
                if (r1 == r2) goto L1a0
                if (r1 == r12) goto L1a0
                r2 = 67
                if (r1 == r2) goto L1a0
                r2 = 83
                if (r1 != r2) goto L19d
                goto L1a0
            L19d:
                r2 = r0
                r3 = r14
                goto L1a8
            L1a0:
                float r7 = r0 * r27
                float r7 = r7 - r4
                float r6 = r14 * r27
                float r6 = r6 - r5
                r3 = r6
                r2 = r7
            L1a8:
                int r0 = r29 + 0
                r4 = r8[r0]
                int r12 = r29 + 1
                r5 = r8[r12]
                int r14 = r29 + 2
                r6 = r8[r14]
                int r15 = r29 + 3
                r7 = r8[r15]
                r1 = r31
                r1.cubicTo(r2, r3, r4, r5, r6, r7)
                r0 = r8[r0]
                r1 = r8[r12]
                r2 = r8[r14]
                r3 = r8[r15]
                r4 = r0
                r5 = r1
                goto L281
            L1c9:
                r29 = r3
                int r3 = r29 + 0
                r0 = r8[r3]
                int r1 = r29 + 1
                r2 = r8[r1]
                if (r29 <= 0) goto L1e0
                r3 = r8[r3]
                r1 = r8[r1]
                r11.lineTo(r3, r1)
                r7 = r0
                r6 = r2
                goto L283
            L1e0:
                r3 = r8[r3]
                r1 = r8[r1]
                r11.moveTo(r3, r1)
                r22 = r0
                r23 = r2
            L1eb:
                r7 = r22
                r6 = r23
                goto L283
            L1f1:
                r29 = r3
                int r3 = r29 + 0
                r0 = r8[r3]
                int r1 = r29 + 1
                r2 = r8[r1]
                r11.lineTo(r0, r2)
                r0 = r8[r3]
                r1 = r8[r1]
                r7 = r0
                r6 = r1
                goto L283
            L206:
                r29 = r3
                r14 = r6
                r0 = r7
                int r3 = r29 + 0
                r1 = r8[r3]
                r2 = 0
                r11.rLineTo(r2, r1)
                r1 = r8[r3]
                r0 = r1
            L215:
                float r6 = r14 + r0
                goto L283
            L219:
                r29 = r3
                r14 = r6
                r0 = r7
                int r3 = r29 + 0
                r1 = r8[r3]
                int r2 = r29 + 1
                r4 = r8[r2]
                int r5 = r29 + 2
                r6 = r8[r5]
                int r7 = r29 + 3
                r12 = r8[r7]
                r11.rQuadTo(r1, r4, r6, r12)
                r1 = r8[r3]
                float r1 = r1 + r0
                r2 = r8[r2]
                float r2 = r2 + r14
                r3 = r8[r5]
                float r0 = r0 + r3
                r3 = r8[r7]
                r7 = r0
                r0 = r3
                goto L27c
            L23e:
                r29 = r3
                r14 = r6
                r0 = r7
                int r3 = r29 + 0
                r1 = r8[r3]
                r2 = 0
                r11.rLineTo(r1, r2)
                r1 = r8[r3]
                float r7 = r0 + r1
                goto L283
            L24f:
                r29 = r3
                r14 = r6
                r0 = r7
                int r3 = r29 + 0
                r2 = r8[r3]
                int r3 = r29 + 1
                r3 = r8[r3]
                int r12 = r29 + 2
                r4 = r8[r12]
                int r15 = r29 + 3
                r5 = r8[r15]
                int r24 = r29 + 4
                r6 = r8[r24]
                int r25 = r29 + 5
                r7 = r8[r25]
                r1 = r31
                r1.rCubicTo(r2, r3, r4, r5, r6, r7)
                r1 = r8[r12]
                float r1 = r1 + r0
                r2 = r8[r15]
                float r2 = r2 + r14
                r3 = r8[r24]
                float r7 = r0 + r3
                r0 = r8[r25]
            L27c:
                float r3 = r14 + r0
                r4 = r1
                r5 = r2
                r2 = r7
            L281:
                r7 = r2
                r6 = r3
            L283:
                r27 = r8
                r25 = r9
                r28 = r10
                goto L3a4
            L28b:
                r29 = r3
                r14 = r6
                r0 = r7
                int r12 = r29 + 5
                r1 = r8[r12]
                float r4 = r1 + r0
                int r15 = r29 + 6
                r1 = r8[r15]
                float r5 = r1 + r14
                int r3 = r29 + 0
                r6 = r8[r3]
                int r3 = r29 + 1
                r7 = r8[r3]
                int r3 = r29 + 2
                r25 = r8[r3]
                int r3 = r29 + 3
                r1 = r8[r3]
                r2 = 0
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 == 0) goto L2b3
                r24 = 1
                goto L2b5
            L2b3:
                r24 = 0
            L2b5:
                int r3 = r29 + 4
                r1 = r8[r3]
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 == 0) goto L2c0
                r26 = 1
                goto L2c2
            L2c0:
                r26 = 0
            L2c2:
                r1 = r31
                r2 = r0
                r3 = r14
                r27 = r8
                r8 = r25
                r25 = r9
                r9 = r24
                r28 = r10
                r10 = r26
                m4835a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r1 = r27[r12]
                float r7 = r0 + r1
                r0 = r27[r15]
                float r6 = r14 + r0
                goto L3a2
            L2df:
                r29 = r3
                r0 = r7
                r27 = r8
                r25 = r9
                r28 = r10
                int r3 = r29 + 0
                r1 = r27[r3]
                r11.lineTo(r0, r1)
                r6 = r27[r3]
                goto L3a4
            L2f3:
                r29 = r3
                r27 = r8
                r25 = r9
                r28 = r10
                int r3 = r29 + 0
                r0 = r27[r3]
                int r1 = r29 + 1
                r2 = r27[r1]
                int r4 = r29 + 2
                r5 = r27[r4]
                int r6 = r29 + 3
                r7 = r27[r6]
                r11.quadTo(r0, r2, r5, r7)
                r0 = r27[r3]
                r1 = r27[r1]
                r2 = r27[r4]
                r3 = r27[r6]
                r7 = r2
                r6 = r3
                goto L35d
            L319:
                r29 = r3
                r14 = r6
                r27 = r8
                r25 = r9
                r28 = r10
                int r3 = r29 + 0
                r0 = r27[r3]
                r11.lineTo(r0, r14)
                r7 = r27[r3]
                goto L3a4
            L32d:
                r29 = r3
                r27 = r8
                r25 = r9
                r28 = r10
                int r3 = r29 + 0
                r2 = r27[r3]
                int r3 = r29 + 1
                r3 = r27[r3]
                int r0 = r29 + 2
                r4 = r27[r0]
                int r8 = r29 + 3
                r5 = r27[r8]
                int r9 = r29 + 4
                r6 = r27[r9]
                int r10 = r29 + 5
                r7 = r27[r10]
                r1 = r31
                r1.cubicTo(r2, r3, r4, r5, r6, r7)
                r1 = r27[r9]
                r2 = r27[r10]
                r0 = r27[r0]
                r3 = r27[r8]
                r7 = r1
                r6 = r2
                r1 = r3
            L35d:
                r4 = r0
                r5 = r1
                goto L3a4
            L360:
                r29 = r3
                r14 = r6
                r0 = r7
                r27 = r8
                r25 = r9
                r28 = r10
                int r12 = r29 + 5
                r4 = r27[r12]
                int r15 = r29 + 6
                r5 = r27[r15]
                int r3 = r29 + 0
                r6 = r27[r3]
                int r3 = r29 + 1
                r7 = r27[r3]
                int r3 = r29 + 2
                r8 = r27[r3]
                int r3 = r29 + 3
                r1 = r27[r3]
                r2 = 0
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 == 0) goto L389
                r9 = 1
                goto L38a
            L389:
                r9 = 0
            L38a:
                int r3 = r29 + 4
                r1 = r27[r3]
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 == 0) goto L394
                r10 = 1
                goto L395
            L394:
                r10 = 0
            L395:
                r1 = r31
                r2 = r0
                r3 = r14
                m4835a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r0 = r27[r12]
                r1 = r27[r15]
                r7 = r0
                r6 = r1
            L3a2:
                r5 = r6
                r4 = r7
            L3a4:
                int r3 = r29 + r21
                r1 = r25
                r9 = r1
                r8 = r27
                r10 = r28
                r12 = 6
                r14 = 109(0x6d, float:1.53E-43)
                r15 = 0
                r0 = r30
                goto L52
            L3b5:
                r14 = r6
                r0 = r7
                r28 = r10
                r1 = 0
                r13[r1] = r0
                r13[r16] = r14
                r13[r17] = r4
                r13[r18] = r5
                r13[r19] = r22
                r13[r20] = r23
                r0 = r30[r28]
                char r0 = r0.f8485a
                int r10 = r28 + 1
                r1 = r0
                r12 = 6
                r14 = 109(0x6d, float:1.53E-43)
                r15 = 0
                r0 = r30
                goto Ld
            L3d5:
                return
        }
    }

    /* renamed from: a */
    public static boolean m4830a(p084f0.C1941d.a[] r4, p084f0.C1941d.a[] r5) {
            r0 = 0
            if (r4 == 0) goto L2c
            if (r5 != 0) goto L6
            goto L2c
        L6:
            int r1 = r4.length
            int r2 = r5.length
            if (r1 == r2) goto Lb
            return r0
        Lb:
            r1 = 0
        Lc:
            int r2 = r4.length
            if (r1 >= r2) goto L2a
            r2 = r4[r1]
            char r2 = r2.f8485a
            r3 = r5[r1]
            char r3 = r3.f8485a
            if (r2 != r3) goto L29
            r2 = r4[r1]
            float[] r2 = r2.f8486b
            int r2 = r2.length
            r3 = r5[r1]
            float[] r3 = r3.f8486b
            int r3 = r3.length
            if (r2 == r3) goto L26
            goto L29
        L26:
            int r1 = r1 + 1
            goto Lc
        L29:
            return r0
        L2a:
            r4 = 1
            return r4
        L2c:
            return r0
    }

    /* renamed from: b */
    public static float[] m4831b(float[] r2, int r3, int r4) {
            if (r3 > r4) goto L1a
            int r0 = r2.length
            if (r3 < 0) goto L14
            if (r3 > r0) goto L14
            int r4 = r4 - r3
            int r0 = r0 - r3
            int r0 = java.lang.Math.min(r4, r0)
            float[] r4 = new float[r4]
            r1 = 0
            java.lang.System.arraycopy(r2, r3, r4, r1, r0)
            return r4
        L14:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            throw r2
        L1a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    /* renamed from: c */
    public static p084f0.C1941d.a[] m4832c(java.lang.String r16) {
            r0 = r16
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 1
            r4 = 0
        Le:
            int r5 = r16.length()
            if (r3 >= r5) goto Ldf
        L14:
            int r5 = r16.length()
            r6 = 69
            r7 = 101(0x65, float:1.42E-43)
            if (r3 >= r5) goto L3a
            char r5 = r0.charAt(r3)
            int r8 = r5 + (-65)
            int r9 = r5 + (-90)
            int r9 = r9 * r8
            if (r9 <= 0) goto L32
            int r8 = r5 + (-97)
            int r9 = r5 + (-122)
            int r9 = r9 * r8
            if (r9 > 0) goto L37
        L32:
            if (r5 == r7) goto L37
            if (r5 == r6) goto L37
            goto L3a
        L37:
            int r3 = r3 + 1
            goto L14
        L3a:
            java.lang.String r4 = r0.substring(r4, r3)
            java.lang.String r4 = r4.trim()
            int r5 = r4.length()
            if (r5 <= 0) goto Ld7
            char r5 = r4.charAt(r2)
            r8 = 122(0x7a, float:1.71E-43)
            if (r5 == r8) goto Lc9
            char r5 = r4.charAt(r2)
            r8 = 90
            if (r5 != r8) goto L5a
            goto Lc9
        L5a:
            int r5 = r4.length()     // Catch: java.lang.NumberFormatException -> Lba
            float[] r5 = new float[r5]     // Catch: java.lang.NumberFormatException -> Lba
            int r8 = r4.length()     // Catch: java.lang.NumberFormatException -> Lba
            r9 = 1
            r10 = 0
        L66:
            if (r9 >= r8) goto Lb2
            r2 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = r9
        L6d:
            int r15 = r4.length()     // Catch: java.lang.NumberFormatException -> Lba
            if (r14 >= r15) goto L9b
            char r15 = r4.charAt(r14)     // Catch: java.lang.NumberFormatException -> Lba
            r7 = 32
            if (r15 == r7) goto L91
            r7 = 101(0x65, float:1.42E-43)
            if (r15 == r6) goto L8f
            if (r15 == r7) goto L8f
            switch(r15) {
                case 44: goto L93;
                case 45: goto L89;
                case 46: goto L85;
                default: goto L84;
            }     // Catch: java.lang.NumberFormatException -> Lba
        L84:
            goto L94
        L85:
            if (r12 != 0) goto L8d
            r12 = 1
            goto L94
        L89:
            if (r14 == r9) goto L94
            if (r13 != 0) goto L94
        L8d:
            r11 = 1
            goto L93
        L8f:
            r13 = 1
            goto L95
        L91:
            r7 = 101(0x65, float:1.42E-43)
        L93:
            r2 = 1
        L94:
            r13 = 0
        L95:
            if (r2 == 0) goto L98
            goto L9b
        L98:
            int r14 = r14 + 1
            goto L6d
        L9b:
            if (r9 >= r14) goto Laa
            int r2 = r10 + 1
            java.lang.String r9 = r4.substring(r9, r14)     // Catch: java.lang.NumberFormatException -> Lba
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> Lba
            r5[r10] = r9     // Catch: java.lang.NumberFormatException -> Lba
            r10 = r2
        Laa:
            if (r11 == 0) goto Lad
            goto Laf
        Lad:
            int r14 = r14 + 1
        Laf:
            r9 = r14
            r2 = 0
            goto L66
        Lb2:
            float[] r2 = m4831b(r5, r2, r10)     // Catch: java.lang.NumberFormatException -> Lba
            r5 = 0
            r5 = r2
            r2 = 0
            goto Lcb
        Lba:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "error in parsing \""
            java.lang.String r3 = "\""
            java.lang.String r2 = android.support.v4.media.C0145d.m257a(r2, r4, r3)
            r1.<init>(r2, r0)
            throw r1
        Lc9:
            float[] r5 = new float[r2]
        Lcb:
            char r2 = r4.charAt(r2)
            f0.d$a r4 = new f0.d$a
            r4.<init>(r2, r5)
            r1.add(r4)
        Ld7:
            int r2 = r3 + 1
            r4 = 0
            r4 = r3
            r3 = r2
            r2 = 0
            goto Le
        Ldf:
            int r3 = r3 - r4
            r2 = 1
            if (r3 != r2) goto Lf8
            int r2 = r16.length()
            if (r4 >= r2) goto Lf8
            char r0 = r0.charAt(r4)
            r2 = 0
            float[] r2 = new float[r2]
            f0.d$a r3 = new f0.d$a
            r3.<init>(r0, r2)
            r1.add(r3)
        Lf8:
            int r0 = r1.size()
            f0.d$a[] r0 = new p084f0.C1941d.a[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            f0.d$a[] r0 = (p084f0.C1941d.a[]) r0
            return r0
    }

    /* renamed from: d */
    public static android.graphics.Path m4833d(java.lang.String r3) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            f0.d$a[] r1 = m4832c(r3)
            if (r1 == 0) goto L1c
            p084f0.C1941d.a.m4836b(r1, r0)     // Catch: java.lang.RuntimeException -> Lf
            return r0
        Lf:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error in parsing "
            java.lang.String r3 = p064e.C1493g.m4049a(r2, r3)
            r1.<init>(r3, r0)
            throw r1
        L1c:
            r3 = 0
            return r3
    }

    /* renamed from: e */
    public static p084f0.C1941d.a[] m4834e(p084f0.C1941d.a[] r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            int r0 = r4.length
            f0.d$a[] r0 = new p084f0.C1941d.a[r0]
            r1 = 0
        L8:
            int r2 = r4.length
            if (r1 >= r2) goto L17
            f0.d$a r2 = new f0.d$a
            r3 = r4[r1]
            r2.<init>(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L17:
            return r0
    }
}
