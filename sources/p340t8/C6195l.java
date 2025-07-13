package p340t8;

/* renamed from: t8.l */
/* loaded from: classes.dex */
public class C6195l {

    /* renamed from: a */
    @java.lang.Deprecated
    public float f24121a;

    /* renamed from: b */
    @java.lang.Deprecated
    public float f24122b;

    /* renamed from: c */
    @java.lang.Deprecated
    public float f24123c;

    /* renamed from: d */
    @java.lang.Deprecated
    public float f24124d;

    /* renamed from: e */
    @java.lang.Deprecated
    public float f24125e;

    /* renamed from: f */
    @java.lang.Deprecated
    public float f24126f;

    /* renamed from: g */
    public final java.util.List<p340t8.C6195l.e> f24127g;

    /* renamed from: h */
    public final java.util.List<p340t8.C6195l.f> f24128h;

    /* renamed from: t8.l$a */
    public static class a extends p340t8.C6195l.f {

        /* renamed from: b */
        public final p340t8.C6195l.c f24129b;

        public a(p340t8.C6195l.c r1) {
                r0 = this;
                r0.<init>()
                r0.f24129b = r1
                return
        }

        @Override // p340t8.C6195l.f
        /* renamed from: a */
        public void mo12796a(android.graphics.Matrix r22, p328s8.C5995a r23, int r24, android.graphics.Canvas r25) {
                r21 = this;
                r0 = r21
                r1 = r23
                r2 = r24
                r7 = r25
                t8.l$c r3 = r0.f24129b
                float r4 = r3.f24138f
                float r5 = r3.f24139g
                android.graphics.RectF r3 = new android.graphics.RectF
                t8.l$c r6 = r0.f24129b
                float r8 = r6.f24134b
                float r9 = r6.f24135c
                float r10 = r6.f24136d
                float r6 = r6.f24137e
                r3.<init>(r8, r9, r10, r6)
                r6 = 0
                r8 = 0
                r9 = 1
                int r10 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r10 >= 0) goto L26
                r10 = 1
                goto L27
            L26:
                r10 = 0
            L27:
                android.graphics.Path r11 = r1.f23113g
                r12 = 3
                r13 = 2
                if (r10 == 0) goto L3e
                int[] r14 = p328s8.C5995a.f23105k
                r14[r8] = r8
                int r8 = r1.f23112f
                r14[r9] = r8
                int r8 = r1.f23111e
                r14[r13] = r8
                int r8 = r1.f23110d
                r14[r12] = r8
                goto L67
            L3e:
                r11.rewind()
                float r14 = r3.centerX()
                float r15 = r3.centerY()
                r11.moveTo(r14, r15)
                r11.arcTo(r3, r4, r5)
                r11.close()
                int r14 = -r2
                float r14 = (float) r14
                r3.inset(r14, r14)
                int[] r14 = p328s8.C5995a.f23105k
                r14[r8] = r8
                int r8 = r1.f23110d
                r14[r9] = r8
                int r8 = r1.f23111e
                r14[r13] = r8
                int r8 = r1.f23112f
                r14[r12] = r8
            L67:
                float r8 = r3.width()
                r12 = 1073741824(0x40000000, float:2.0)
                float r17 = r8 / r12
                int r6 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
                if (r6 > 0) goto L74
                goto Lcc
            L74:
                float r2 = (float) r2
                float r2 = r2 / r17
                r6 = 1065353216(0x3f800000, float:1.0)
                float r2 = r6 - r2
                float r8 = p065e0.C1496a.m4063a(r6, r2, r12, r2)
                float[] r19 = p328s8.C5995a.f23106l
                r19[r9] = r2
                r19[r13] = r8
                android.graphics.RadialGradient r2 = new android.graphics.RadialGradient
                float r15 = r3.centerX()
                float r16 = r3.centerY()
                int[] r18 = p328s8.C5995a.f23105k
                android.graphics.Shader$TileMode r20 = android.graphics.Shader.TileMode.CLAMP
                r14 = r2
                r14.<init>(r15, r16, r17, r18, r19, r20)
                android.graphics.Paint r8 = r1.f23108b
                r8.setShader(r2)
                r25.save()
                r2 = r22
                r7.concat(r2)
                float r2 = r3.height()
                float r8 = r3.width()
                float r2 = r2 / r8
                r7.scale(r6, r2)
                if (r10 != 0) goto Lbc
                android.graphics.Region$Op r2 = android.graphics.Region.Op.DIFFERENCE
                r7.clipPath(r11, r2)
                android.graphics.Paint r2 = r1.f23114h
                r7.drawPath(r11, r2)
            Lbc:
                r6 = 1
                android.graphics.Paint r8 = r1.f23108b
                r1 = r25
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r8
                r1.drawArc(r2, r3, r4, r5, r6)
                r25.restore()
            Lcc:
                return
        }
    }

    /* renamed from: t8.l$b */
    public static class b extends p340t8.C6195l.f {

        /* renamed from: b */
        public final p340t8.C6195l.d f24130b;

        /* renamed from: c */
        public final float f24131c;

        /* renamed from: d */
        public final float f24132d;

        public b(p340t8.C6195l.d r1, float r2, float r3) {
                r0 = this;
                r0.<init>()
                r0.f24130b = r1
                r0.f24131c = r2
                r0.f24132d = r3
                return
        }

        @Override // p340t8.C6195l.f
        /* renamed from: a */
        public void mo12796a(android.graphics.Matrix r12, p328s8.C5995a r13, int r14, android.graphics.Canvas r15) {
                r11 = this;
                t8.l$d r0 = r11.f24130b
                float r1 = r0.f24141c
                float r2 = r11.f24132d
                float r1 = r1 - r2
                float r0 = r0.f24140b
                float r2 = r11.f24131c
                float r0 = r0 - r2
                android.graphics.RectF r2 = new android.graphics.RectF
                double r3 = (double) r1
                double r0 = (double) r0
                double r0 = java.lang.Math.hypot(r3, r0)
                float r0 = (float) r0
                r1 = 0
                r2.<init>(r1, r1, r0, r1)
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>(r12)
                float r12 = r11.f24131c
                float r3 = r11.f24132d
                r0.preTranslate(r12, r3)
                float r12 = r11.m12802b()
                r0.preRotate(r12)
                java.util.Objects.requireNonNull(r13)
                float r12 = r2.bottom
                float r3 = (float) r14
                float r12 = r12 + r3
                r2.bottom = r12
                int r12 = -r14
                float r12 = (float) r12
                r2.offset(r1, r12)
                int[] r8 = p328s8.C5995a.f23103i
                int r12 = r13.f23112f
                r14 = 0
                r8[r14] = r12
                int r12 = r13.f23111e
                r14 = 1
                r8[r14] = r12
                int r12 = r13.f23110d
                r14 = 2
                r8[r14] = r12
                android.graphics.Paint r12 = r13.f23109c
                android.graphics.LinearGradient r14 = new android.graphics.LinearGradient
                float r6 = r2.left
                float r5 = r2.top
                float r7 = r2.bottom
                float[] r9 = p328s8.C5995a.f23104j
                android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.CLAMP
                r3 = r14
                r4 = r6
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                r12.setShader(r14)
                r15.save()
                r15.concat(r0)
                android.graphics.Paint r12 = r13.f23109c
                r15.drawRect(r2, r12)
                r15.restore()
                return
        }

        /* renamed from: b */
        public float m12802b() {
                r3 = this;
                t8.l$d r0 = r3.f24130b
                float r1 = r0.f24141c
                float r2 = r3.f24132d
                float r1 = r1 - r2
                float r0 = r0.f24140b
                float r2 = r3.f24131c
                float r0 = r0 - r2
                float r1 = r1 / r0
                double r0 = (double) r1
                double r0 = java.lang.Math.atan(r0)
                double r0 = java.lang.Math.toDegrees(r0)
                float r0 = (float) r0
                return r0
        }
    }

    /* renamed from: t8.l$c */
    public static class c extends p340t8.C6195l.e {

        /* renamed from: h */
        public static final android.graphics.RectF f24133h = null;

        /* renamed from: b */
        @java.lang.Deprecated
        public float f24134b;

        /* renamed from: c */
        @java.lang.Deprecated
        public float f24135c;

        /* renamed from: d */
        @java.lang.Deprecated
        public float f24136d;

        /* renamed from: e */
        @java.lang.Deprecated
        public float f24137e;

        /* renamed from: f */
        @java.lang.Deprecated
        public float f24138f;

        /* renamed from: g */
        @java.lang.Deprecated
        public float f24139g;

        static {
                android.graphics.RectF r0 = new android.graphics.RectF
                r0.<init>()
                p340t8.C6195l.c.f24133h = r0
                return
        }

        public c(float r1, float r2, float r3, float r4) {
                r0 = this;
                r0.<init>()
                r0.f24134b = r1
                r0.f24135c = r2
                r0.f24136d = r3
                r0.f24137e = r4
                return
        }

        @Override // p340t8.C6195l.e
        /* renamed from: a */
        public void mo12803a(android.graphics.Matrix r6, android.graphics.Path r7) {
                r5 = this;
                android.graphics.Matrix r0 = r5.f24142a
                r6.invert(r0)
                r7.transform(r0)
                android.graphics.RectF r0 = p340t8.C6195l.c.f24133h
                float r1 = r5.f24134b
                float r2 = r5.f24135c
                float r3 = r5.f24136d
                float r4 = r5.f24137e
                r0.set(r1, r2, r3, r4)
                float r1 = r5.f24138f
                float r2 = r5.f24139g
                r3 = 0
                r7.arcTo(r0, r1, r2, r3)
                r7.transform(r6)
                return
        }
    }

    /* renamed from: t8.l$d */
    public static class d extends p340t8.C6195l.e {

        /* renamed from: b */
        public float f24140b;

        /* renamed from: c */
        public float f24141c;

        public d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p340t8.C6195l.e
        /* renamed from: a */
        public void mo12803a(android.graphics.Matrix r3, android.graphics.Path r4) {
                r2 = this;
                android.graphics.Matrix r0 = r2.f24142a
                r3.invert(r0)
                r4.transform(r0)
                float r0 = r2.f24140b
                float r1 = r2.f24141c
                r4.lineTo(r0, r1)
                r4.transform(r3)
                return
        }
    }

    /* renamed from: t8.l$e */
    public static abstract class e {

        /* renamed from: a */
        public final android.graphics.Matrix f24142a;

        public e() {
                r1 = this;
                r1.<init>()
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r1.f24142a = r0
                return
        }

        /* renamed from: a */
        public abstract void mo12803a(android.graphics.Matrix r1, android.graphics.Path r2);
    }

    /* renamed from: t8.l$f */
    public static abstract class f {

        /* renamed from: a */
        public static final android.graphics.Matrix f24143a = null;

        static {
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                p340t8.C6195l.f.f24143a = r0
                return
        }

        public f() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public abstract void mo12796a(android.graphics.Matrix r1, p328s8.C5995a r2, int r3, android.graphics.Canvas r4);
    }

    public C6195l() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f24127g = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f24128h = r0
            r0 = 0
            r1 = 1132920832(0x43870000, float:270.0)
            r2.m12801e(r0, r0, r1, r0)
            return
    }

    /* renamed from: a */
    public void m12797a(float r5, float r6, float r7, float r8, float r9, float r10) {
            r4 = this;
            t8.l$c r0 = new t8.l$c
            r0.<init>(r5, r6, r7, r8)
            r0.f24138f = r9
            r0.f24139g = r10
            java.util.List<t8.l$e> r1 = r4.f24127g
            r1.add(r0)
            t8.l$a r1 = new t8.l$a
            r1.<init>(r0)
            float r0 = r9 + r10
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 >= 0) goto L1c
            r10 = 1
            goto L1d
        L1c:
            r10 = 0
        L1d:
            r2 = 1135869952(0x43b40000, float:360.0)
            r3 = 1127481344(0x43340000, float:180.0)
            if (r10 == 0) goto L25
            float r9 = r9 + r3
            float r9 = r9 % r2
        L25:
            if (r10 == 0) goto L2a
            float r3 = r3 + r0
            float r3 = r3 % r2
            goto L2b
        L2a:
            r3 = r0
        L2b:
            r4.m12798b(r9)
            java.util.List<t8.l$f> r9 = r4.f24128h
            r9.add(r1)
            r4.f24125e = r3
            float r9 = r5 + r7
            r10 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r10
            float r7 = r7 - r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r5
            double r0 = (double) r0
            double r2 = java.lang.Math.toRadians(r0)
            double r2 = java.lang.Math.cos(r2)
            float r2 = (float) r2
            float r7 = r7 * r2
            float r7 = r7 + r9
            r4.f24123c = r7
            float r7 = r6 + r8
            float r7 = r7 * r10
            float r8 = r8 - r6
            float r8 = r8 / r5
            double r5 = java.lang.Math.toRadians(r0)
            double r5 = java.lang.Math.sin(r5)
            float r5 = (float) r5
            float r8 = r8 * r5
            float r8 = r8 + r7
            r4.f24124d = r8
            return
    }

    /* renamed from: b */
    public final void m12798b(float r5) {
            r4 = this;
            float r0 = r4.f24125e
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 != 0) goto L7
            return
        L7:
            float r0 = r5 - r0
            r1 = 1135869952(0x43b40000, float:360.0)
            float r0 = r0 + r1
            float r0 = r0 % r1
            r1 = 1127481344(0x43340000, float:180.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L14
            return
        L14:
            t8.l$c r1 = new t8.l$c
            float r2 = r4.f24123c
            float r3 = r4.f24124d
            r1.<init>(r2, r3, r2, r3)
            float r2 = r4.f24125e
            r1.f24138f = r2
            r1.f24139g = r0
            java.util.List<t8.l$f> r0 = r4.f24128h
            t8.l$a r2 = new t8.l$a
            r2.<init>(r1)
            r0.add(r2)
            r4.f24125e = r5
            return
    }

    /* renamed from: c */
    public void m12799c(android.graphics.Matrix r4, android.graphics.Path r5) {
            r3 = this;
            java.util.List<t8.l$e> r0 = r3.f24127g
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L17
            java.util.List<t8.l$e> r2 = r3.f24127g
            java.lang.Object r2 = r2.get(r1)
            t8.l$e r2 = (p340t8.C6195l.e) r2
            r2.mo12803a(r4, r5)
            int r1 = r1 + 1
            goto L7
        L17:
            return
    }

    /* renamed from: d */
    public void m12800d(float r5, float r6) {
            r4 = this;
            t8.l$d r0 = new t8.l$d
            r0.<init>()
            r0.f24140b = r5
            r0.f24141c = r6
            java.util.List<t8.l$e> r1 = r4.f24127g
            r1.add(r0)
            t8.l$b r1 = new t8.l$b
            float r2 = r4.f24123c
            float r3 = r4.f24124d
            r1.<init>(r0, r2, r3)
            float r0 = r1.m12802b()
            r2 = 1132920832(0x43870000, float:270.0)
            float r0 = r0 + r2
            float r3 = r1.m12802b()
            float r3 = r3 + r2
            r4.m12798b(r0)
            java.util.List<t8.l$f> r0 = r4.f24128h
            r0.add(r1)
            r4.f24125e = r3
            r4.f24123c = r5
            r4.f24124d = r6
            return
    }

    /* renamed from: e */
    public void m12801e(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.f24121a = r1
            r0.f24122b = r2
            r0.f24123c = r1
            r0.f24124d = r2
            r0.f24125e = r3
            float r3 = r3 + r4
            r1 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 % r1
            r0.f24126f = r3
            java.util.List<t8.l$e> r1 = r0.f24127g
            r1.clear()
            java.util.List<t8.l$f> r1 = r0.f24128h
            r1.clear()
            return
    }
}
