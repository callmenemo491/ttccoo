package p348u1;

/* renamed from: u1.d */
/* loaded from: classes.dex */
public class C6286d {

    /* renamed from: u1.d$a */
    public static class a implements android.animation.TypeEvaluator<androidx.core.graphics.PathParser.PathDataNode[]> {

        /* renamed from: a */
        public p084f0.C1941d.a[] f24465a;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.animation.TypeEvaluator
        public androidx.core.graphics.PathParser.PathDataNode[] evaluate(float r10, androidx.core.graphics.PathParser.PathDataNode[] r11, androidx.core.graphics.PathParser.PathDataNode[] r12) {
                r9 = this;
                f0.d$a[] r11 = (p084f0.C1941d.a[]) r11
                f0.d$a[] r12 = (p084f0.C1941d.a[]) r12
                boolean r0 = p084f0.C1941d.m4830a(r11, r12)
                if (r0 == 0) goto L4d
                f0.d$a[] r0 = r9.f24465a
                boolean r0 = p084f0.C1941d.m4830a(r0, r11)
                if (r0 != 0) goto L18
                f0.d$a[] r0 = p084f0.C1941d.m4834e(r11)
                r9.f24465a = r0
            L18:
                r0 = 0
                r1 = 0
            L1a:
                int r2 = r11.length
                if (r1 >= r2) goto L4a
                f0.d$a[] r2 = r9.f24465a
                r2 = r2[r1]
                r3 = r11[r1]
                r4 = r12[r1]
                java.util.Objects.requireNonNull(r2)
                char r5 = r3.f8485a
                r2.f8485a = r5
                r5 = 0
            L2d:
                float[] r6 = r3.f8486b
                int r7 = r6.length
                if (r5 >= r7) goto L47
                float[] r7 = r2.f8486b
                r6 = r6[r5]
                r8 = 1065353216(0x3f800000, float:1.0)
                float r8 = r8 - r10
                float r8 = r8 * r6
                float[] r6 = r4.f8486b
                r6 = r6[r5]
                float r6 = r6 * r10
                float r6 = r6 + r8
                r7[r5] = r6
                int r5 = r5 + 1
                goto L2d
            L47:
                int r1 = r1 + 1
                goto L1a
            L4a:
                f0.d$a[] r10 = r9.f24465a
                return r10
            L4d:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.String r11 = "Can't interpolate between two incompatible pathData"
                r10.<init>(r11)
                throw r10
        }
    }

    /* renamed from: a */
    public static android.animation.Animator m12911a(android.content.Context r21, android.content.res.Resources r22, android.content.res.Resources.Theme r23, org.xmlpull.v1.XmlPullParser r24, android.util.AttributeSet r25, android.animation.AnimatorSet r26, int r27, float r28) {
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r26
            int r12 = r24.getDepth()
            r0 = 0
            r1 = 0
            r13 = r1
        Lf:
            int r1 = r24.next()
            r2 = 3
            r14 = 0
            if (r1 != r2) goto L1d
            int r3 = r24.getDepth()
            if (r3 <= r12) goto L34a
        L1d:
            r3 = 1
            if (r1 == r3) goto L34a
            r4 = 2
            if (r1 == r4) goto L24
            goto Lf
        L24:
            java.lang.String r1 = r24.getName()
            java.lang.String r5 = "objectAnimator"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L48
            android.animation.ObjectAnimator r7 = new android.animation.ObjectAnimator
            r7.<init>()
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r25
            r4 = r7
            r5 = r28
            r6 = r24
            m12915e(r0, r1, r2, r3, r4, r5, r6)
            r0 = r7
            goto L31d
        L48:
            java.lang.String r5 = "animator"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L63
            r4 = 0
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r25
            r5 = r28
            r6 = r24
            android.animation.ValueAnimator r0 = m12915e(r0, r1, r2, r3, r4, r5, r6)
            goto L31d
        L63:
            java.lang.String r5 = "set"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto La4
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            int[] r0 = p348u1.C6283a.f24449h
            r7 = r25
            android.content.res.TypedArray r6 = p065e0.C1505j.m4095i(r8, r9, r7, r0)
            java.lang.String r0 = "ordering"
            boolean r0 = p065e0.C1505j.m4094h(r10, r0)
            if (r0 != 0) goto L84
            r0 = 0
            r16 = 0
            goto L8a
        L84:
            int r0 = r6.getInt(r14, r14)
            r16 = r0
        L8a:
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r15
            r17 = r6
            r6 = r16
            r7 = r28
            m12911a(r0, r1, r2, r3, r4, r5, r6, r7)
            r17.recycle()
            r0 = r15
            goto L31d
        La4:
            java.lang.String r5 = "propertyValuesHolder"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L333
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r24)
            r6 = 0
        Lb1:
            int r7 = r24.getEventType()
            if (r7 == r2) goto L2f9
            if (r7 == r3) goto L2f9
            if (r7 == r4) goto Lbf
            r24.next()
            goto Lb1
        Lbf:
            java.lang.String r7 = r24.getName()
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L2e5
            int[] r3 = p348u1.C6283a.f24450i
            android.content.res.TypedArray r3 = p065e0.C1505j.m4095i(r8, r9, r1, r3)
            java.lang.String r7 = "propertyName"
            java.lang.String r7 = p065e0.C1505j.m4090d(r3, r10, r7, r2)
            java.lang.String r14 = "valueType"
            boolean r14 = p065e0.C1505j.m4094h(r10, r14)
            r15 = 4
            if (r14 != 0) goto Le0
            r4 = 4
            goto Le4
        Le0:
            int r4 = r3.getInt(r4, r15)
        Le4:
            r14 = 0
            r16 = r1
            r15 = r4
        Le8:
            int r1 = r24.next()
            if (r1 == r2) goto L1f0
            r17 = r2
            r2 = 1
            if (r1 == r2) goto L1f0
            java.lang.String r1 = r24.getName()
            java.lang.String r2 = "keyframe"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1e6
            java.lang.String r1 = "value"
            r2 = 4
            if (r15 != r2) goto L132
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r24)
            int[] r15 = p348u1.C6283a.f24451j
            android.content.res.TypedArray r2 = p065e0.C1505j.m4095i(r8, r9, r2, r15)
            boolean r15 = p065e0.C1505j.m4094h(r10, r1)
            if (r15 != 0) goto L116
            r15 = 0
            goto L11b
        L116:
            r15 = 0
            android.util.TypedValue r15 = r2.peekValue(r15)
        L11b:
            if (r15 == 0) goto L120
            r17 = 1
            goto L122
        L120:
            r17 = 0
        L122:
            if (r17 == 0) goto L12e
            int r15 = r15.type
            boolean r15 = m12914d(r15)
            if (r15 == 0) goto L12e
            r15 = 3
            goto L12f
        L12e:
            r15 = 0
        L12f:
            r2.recycle()
        L132:
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r24)
            r18 = r5
            int[] r5 = p348u1.C6283a.f24451j
            android.content.res.TypedArray r2 = p065e0.C1505j.m4095i(r8, r9, r2, r5)
            java.lang.String r5 = "fraction"
            boolean r5 = p065e0.C1505j.m4094h(r10, r5)
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r5 != 0) goto L149
            goto L14e
        L149:
            r5 = 3
            float r8 = r2.getFloat(r5, r8)
        L14e:
            boolean r5 = p065e0.C1505j.m4094h(r10, r1)
            if (r5 != 0) goto L156
            r5 = 0
            goto L15b
        L156:
            r5 = 0
            android.util.TypedValue r5 = r2.peekValue(r5)
        L15b:
            r9 = 4
            if (r5 == 0) goto L161
            r17 = 1
            goto L163
        L161:
            r17 = 0
        L163:
            if (r15 != r9) goto L173
            if (r17 == 0) goto L171
            int r5 = r5.type
            boolean r5 = m12914d(r5)
            if (r5 == 0) goto L171
            r5 = 3
            goto L174
        L171:
            r5 = 0
            goto L174
        L173:
            r5 = r15
        L174:
            if (r17 == 0) goto L1a5
            if (r5 == 0) goto L192
            r9 = 1
            if (r5 == r9) goto L180
            r9 = 3
            if (r5 == r9) goto L180
            r1 = 0
            goto L1b0
        L180:
            boolean r1 = p065e0.C1505j.m4094h(r10, r1)
            if (r1 != 0) goto L188
            r1 = 0
            goto L18d
        L188:
            r1 = 0
            int r1 = r2.getInt(r1, r1)
        L18d:
            android.animation.Keyframe r1 = android.animation.Keyframe.ofInt(r8, r1)
            goto L1b0
        L192:
            r5 = 0
            boolean r1 = p065e0.C1505j.m4094h(r10, r1)
            if (r1 != 0) goto L19b
            r1 = 0
            goto L1a0
        L19b:
            r1 = 0
            float r1 = r2.getFloat(r5, r1)
        L1a0:
            android.animation.Keyframe r1 = android.animation.Keyframe.ofFloat(r8, r1)
            goto L1b0
        L1a5:
            if (r5 != 0) goto L1ac
            android.animation.Keyframe r1 = android.animation.Keyframe.ofFloat(r8)
            goto L1b0
        L1ac:
            android.animation.Keyframe r1 = android.animation.Keyframe.ofInt(r8)
        L1b0:
            java.lang.String r5 = "interpolator"
            boolean r5 = p065e0.C1505j.m4094h(r10, r5)
            if (r5 != 0) goto L1ba
            r5 = 0
            goto L1c0
        L1ba:
            r5 = 1
            r8 = 0
            int r5 = r2.getResourceId(r5, r8)
        L1c0:
            r8 = r21
            if (r5 <= 0) goto L1cb
            android.view.animation.Interpolator r5 = android.view.animation.AnimationUtils.loadInterpolator(r8, r5)
            r1.setInterpolator(r5)
        L1cb:
            r2.recycle()
            if (r1 == 0) goto L1da
            if (r14 != 0) goto L1d7
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L1d7:
            r14.add(r1)
        L1da:
            r24.next()
            r2 = 3
            r8 = r22
            r9 = r23
            r5 = r18
            goto Le8
        L1e6:
            r8 = r21
            r8 = r22
            r9 = r23
            r2 = r17
            goto Le8
        L1f0:
            r8 = r21
            r18 = r5
            if (r14 == 0) goto L2c9
            int r1 = r14.size()
            if (r1 <= 0) goto L2c9
            r2 = 0
            java.lang.Object r2 = r14.get(r2)
            android.animation.Keyframe r2 = (android.animation.Keyframe) r2
            int r5 = r1 + (-1)
            java.lang.Object r5 = r14.get(r5)
            android.animation.Keyframe r5 = (android.animation.Keyframe) r5
            float r9 = r5.getFraction()
            r8 = 1065353216(0x3f800000, float:1.0)
            int r17 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r17 >= 0) goto L22c
            r17 = 0
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 >= 0) goto L21f
            r5.setFraction(r8)
            goto L22c
        L21f:
            int r9 = r14.size()
            android.animation.Keyframe r5 = m12912b(r5, r8)
            r14.add(r9, r5)
            int r1 = r1 + 1
        L22c:
            float r5 = r2.getFraction()
            r8 = 0
            int r9 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r9 == 0) goto L247
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 >= 0) goto L23d
            r2.setFraction(r8)
            goto L247
        L23d:
            android.animation.Keyframe r2 = m12912b(r2, r8)
            r5 = 0
            r14.add(r5, r2)
            int r1 = r1 + 1
        L247:
            android.animation.Keyframe[] r2 = new android.animation.Keyframe[r1]
            r14.toArray(r2)
            r5 = 0
        L24d:
            if (r5 >= r1) goto L2bc
            r8 = r2[r5]
            float r9 = r8.getFraction()
            r14 = 0
            int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r9 >= 0) goto L2b3
            if (r5 != 0) goto L260
        L25c:
            r8.setFraction(r14)
            goto L2b3
        L260:
            int r9 = r1 + (-1)
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r5 != r9) goto L267
            goto L25c
        L267:
            int r8 = r5 + 1
            r14 = r5
        L26a:
            if (r8 >= r9) goto L281
            r17 = r2[r8]
            float r17 = r17.getFraction()
            r19 = 0
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 < 0) goto L279
            goto L281
        L279:
            int r14 = r8 + 1
            r20 = r14
            r14 = r8
            r8 = r20
            goto L26a
        L281:
            int r8 = r14 + 1
            r8 = r2[r8]
            float r8 = r8.getFraction()
            int r9 = r5 + (-1)
            r9 = r2[r9]
            float r9 = r9.getFraction()
            float r8 = r8 - r9
            int r9 = r14 - r5
            int r9 = r9 + 2
            float r9 = (float) r9
            float r8 = r8 / r9
            r9 = r5
        L299:
            if (r9 > r14) goto L2b3
            r17 = r1
            r1 = r2[r9]
            int r19 = r9 + (-1)
            r19 = r2[r19]
            float r19 = r19.getFraction()
            float r10 = r19 + r8
            r1.setFraction(r10)
            int r9 = r9 + 1
            r10 = r24
            r1 = r17
            goto L299
        L2b3:
            r17 = r1
            int r5 = r5 + 1
            r10 = r24
            r1 = r17
            goto L24d
        L2bc:
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofKeyframe(r7, r2)
            r2 = 3
            if (r15 != r2) goto L2cb
            u1.e r5 = p348u1.C6287e.f24466a
            r1.setEvaluator(r5)
            goto L2cb
        L2c9:
            r2 = 3
            r1 = 0
        L2cb:
            r5 = 1
            r8 = 0
            if (r1 != 0) goto L2d3
            android.animation.PropertyValuesHolder r1 = m12913c(r3, r4, r8, r5, r7)
        L2d3:
            if (r1 == 0) goto L2e0
            if (r6 != 0) goto L2dd
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6 = r4
        L2dd:
            r6.add(r1)
        L2e0:
            r3.recycle()
            r3 = 1
            goto L2e9
        L2e5:
            r16 = r1
            r18 = r5
        L2e9:
            r24.next()
            r4 = 2
            r8 = r22
            r9 = r23
            r10 = r24
            r1 = r16
            r5 = r18
            goto Lb1
        L2f9:
            if (r6 == 0) goto L30f
            int r1 = r6.size()
            android.animation.PropertyValuesHolder[] r2 = new android.animation.PropertyValuesHolder[r1]
            r3 = 0
        L302:
            if (r3 >= r1) goto L310
            java.lang.Object r4 = r6.get(r3)
            android.animation.PropertyValuesHolder r4 = (android.animation.PropertyValuesHolder) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto L302
        L30f:
            r2 = 0
        L310:
            if (r2 == 0) goto L31c
            boolean r1 = r0 instanceof android.animation.ValueAnimator
            if (r1 == 0) goto L31c
            r1 = r0
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            r1.setValues(r2)
        L31c:
            r14 = 1
        L31d:
            if (r11 == 0) goto L32b
            if (r14 != 0) goto L32b
            if (r13 != 0) goto L328
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L328:
            r13.add(r0)
        L32b:
            r8 = r22
            r9 = r23
            r10 = r24
            goto Lf
        L333:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unknown animator name: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = r24.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L34a:
            if (r11 == 0) goto L374
            if (r13 == 0) goto L374
            int r1 = r13.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r13.iterator()
            r3 = 0
        L359:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L36b
            java.lang.Object r4 = r2.next()
            android.animation.Animator r4 = (android.animation.Animator) r4
            int r5 = r3 + 1
            r1[r3] = r4
            r3 = r5
            goto L359
        L36b:
            if (r27 != 0) goto L371
            r11.playTogether(r1)
            goto L374
        L371:
            r11.playSequentially(r1)
        L374:
            return r0
    }

    /* renamed from: b */
    public static android.animation.Keyframe m12912b(android.animation.Keyframe r2, float r3) {
            java.lang.Class r0 = r2.getType()
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto Ld
            android.animation.Keyframe r2 = android.animation.Keyframe.ofFloat(r3)
            goto L1e
        Ld:
            java.lang.Class r2 = r2.getType()
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r2 != r0) goto L1a
            android.animation.Keyframe r2 = android.animation.Keyframe.ofInt(r3)
            goto L1e
        L1a:
            android.animation.Keyframe r2 = android.animation.Keyframe.ofObject(r3)
        L1e:
            return r2
    }

    /* renamed from: c */
    public static android.animation.PropertyValuesHolder m12913c(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
            android.util.TypedValue r0 = r11.peekValue(r13)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            r3 = 1
            goto Lb
        La:
            r3 = 0
        Lb:
            if (r3 == 0) goto L10
            int r0 = r0.type
            goto L11
        L10:
            r0 = 0
        L11:
            android.util.TypedValue r4 = r11.peekValue(r14)
            if (r4 == 0) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = 0
        L1a:
            if (r5 == 0) goto L1f
            int r4 = r4.type
            goto L20
        L1f:
            r4 = 0
        L20:
            r6 = 4
            r7 = 3
            if (r12 != r6) goto L37
            if (r3 == 0) goto L2c
            boolean r12 = m12914d(r0)
            if (r12 != 0) goto L34
        L2c:
            if (r5 == 0) goto L36
            boolean r12 = m12914d(r4)
            if (r12 == 0) goto L36
        L34:
            r12 = 3
            goto L37
        L36:
            r12 = 0
        L37:
            if (r12 != 0) goto L3b
            r6 = 1
            goto L3c
        L3b:
            r6 = 0
        L3c:
            r8 = 0
            r9 = 2
            if (r12 != r9) goto La9
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            f0.d$a[] r13 = p084f0.C1941d.m4832c(r12)
            f0.d$a[] r14 = p084f0.C1941d.m4832c(r11)
            if (r13 != 0) goto L54
            if (r14 == 0) goto L167
        L54:
            if (r13 == 0) goto L98
            u1.d$a r0 = new u1.d$a
            r0.<init>()
            if (r14 == 0) goto L8d
            boolean r3 = p084f0.C1941d.m4830a(r13, r14)
            if (r3 == 0) goto L6e
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r2] = r13
            r11[r1] = r14
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            goto L95
        L6e:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = " Can't morph from "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r12 = " to "
            r14.append(r12)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r13.<init>(r11)
            throw r13
        L8d:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
        L95:
            r8 = r11
            goto L167
        L98:
            if (r14 == 0) goto L167
            u1.d$a r11 = new u1.d$a
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r2] = r14
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
            goto L167
        La9:
            if (r12 != r7) goto Lae
            u1.e r12 = p348u1.C6287e.f24466a
            goto Laf
        Lae:
            r12 = r8
        Laf:
            r7 = 5
            r10 = 0
            if (r6 == 0) goto Lf8
            if (r3 == 0) goto Le3
            if (r0 != r7) goto Lbc
            float r13 = r11.getDimension(r13, r10)
            goto Lc0
        Lbc:
            float r13 = r11.getFloat(r13, r10)
        Lc0:
            if (r5 == 0) goto Ld9
            if (r4 != r7) goto Lc9
            float r11 = r11.getDimension(r14, r10)
            goto Lcd
        Lc9:
            float r11 = r11.getFloat(r14, r10)
        Lcd:
            float[] r14 = new float[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r14)
            goto L15f
        Ld9:
            float[] r11 = new float[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            goto L15f
        Le3:
            if (r4 != r7) goto Lea
            float r11 = r11.getDimension(r14, r10)
            goto Lee
        Lea:
            float r11 = r11.getFloat(r14, r10)
        Lee:
            float[] r13 = new float[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
            goto L15f
        Lf8:
            if (r3 == 0) goto L13e
            if (r0 != r7) goto L102
            float r13 = r11.getDimension(r13, r10)
            int r13 = (int) r13
            goto L111
        L102:
            boolean r0 = m12914d(r0)
            if (r0 == 0) goto L10d
            int r13 = r11.getColor(r13, r2)
            goto L111
        L10d:
            int r13 = r11.getInt(r13, r2)
        L111:
            if (r5 == 0) goto L135
            if (r4 != r7) goto L11b
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L12a
        L11b:
            boolean r0 = m12914d(r4)
            if (r0 == 0) goto L126
            int r11 = r11.getColor(r14, r2)
            goto L12a
        L126:
            int r11 = r11.getInt(r14, r2)
        L12a:
            int[] r14 = new int[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofInt(r15, r14)
            goto L15f
        L135:
            int[] r11 = new int[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L15f
        L13e:
            if (r5 == 0) goto L160
            if (r4 != r7) goto L148
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L157
        L148:
            boolean r13 = m12914d(r4)
            if (r13 == 0) goto L153
            int r11 = r11.getColor(r14, r2)
            goto L157
        L153:
            int r11 = r11.getInt(r14, r2)
        L157:
            int[] r13 = new int[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofInt(r15, r13)
        L15f:
            r8 = r11
        L160:
            if (r8 == 0) goto L167
            if (r12 == 0) goto L167
            r8.setEvaluator(r12)
        L167:
            return r8
    }

    /* renamed from: d */
    public static boolean m12914d(int r1) {
            r0 = 28
            if (r1 < r0) goto La
            r0 = 31
            if (r1 > r0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    /* renamed from: e */
    public static android.animation.ValueAnimator m12915e(android.content.Context r19, android.content.res.Resources r20, android.content.res.Resources.Theme r21, android.util.AttributeSet r22, android.animation.ValueAnimator r23, float r24, org.xmlpull.v1.XmlPullParser r25) {
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r25
            int[] r4 = p348u1.C6283a.f24448g
            android.content.res.TypedArray r4 = p065e0.C1505j.m4095i(r0, r1, r2, r4)
            int[] r5 = p348u1.C6283a.f24452k
            android.content.res.TypedArray r0 = p065e0.C1505j.m4095i(r0, r1, r2, r5)
            if (r23 != 0) goto L1c
            android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
            r1.<init>()
            goto L1e
        L1c:
            r1 = r23
        L1e:
            java.lang.String r2 = "duration"
            boolean r2 = p065e0.C1505j.m4094h(r3, r2)
            r5 = 300(0x12c, float:4.2E-43)
            r6 = 1
            if (r2 != 0) goto L2a
            goto L2e
        L2a:
            int r5 = r4.getInt(r6, r5)
        L2e:
            long r7 = (long) r5
            java.lang.String r2 = "startOffset"
            boolean r2 = p065e0.C1505j.m4094h(r3, r2)
            r5 = 2
            r9 = 0
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3f
        L3b:
            int r2 = r4.getInt(r5, r9)
        L3f:
            long r10 = (long) r2
            r2 = 7
            java.lang.String r12 = "valueType"
            boolean r12 = p065e0.C1505j.m4094h(r3, r12)
            r13 = 4
            if (r12 != 0) goto L4c
            r2 = 4
            goto L50
        L4c:
            int r2 = r4.getInt(r2, r13)
        L50:
            java.lang.String r12 = "valueFrom"
            boolean r12 = p065e0.C1505j.m4094h(r3, r12)
            r14 = 3
            if (r12 == 0) goto La9
            java.lang.String r12 = "valueTo"
            boolean r12 = p065e0.C1505j.m4094h(r3, r12)
            if (r12 == 0) goto La9
            r12 = 6
            r15 = 5
            if (r2 != r13) goto L9a
            android.util.TypedValue r2 = r4.peekValue(r15)
            if (r2 == 0) goto L6e
            r16 = 1
            goto L70
        L6e:
            r16 = 0
        L70:
            if (r16 == 0) goto L75
            int r2 = r2.type
            goto L76
        L75:
            r2 = 0
        L76:
            android.util.TypedValue r5 = r4.peekValue(r12)
            if (r5 == 0) goto L7f
            r17 = 1
            goto L81
        L7f:
            r17 = 0
        L81:
            if (r17 == 0) goto L86
            int r5 = r5.type
            goto L87
        L86:
            r5 = 0
        L87:
            if (r16 == 0) goto L8f
            boolean r2 = m12914d(r2)
            if (r2 != 0) goto L97
        L8f:
            if (r17 == 0) goto L99
            boolean r2 = m12914d(r5)
            if (r2 == 0) goto L99
        L97:
            r2 = 3
            goto L9a
        L99:
            r2 = 0
        L9a:
            java.lang.String r5 = ""
            android.animation.PropertyValuesHolder r2 = m12913c(r4, r2, r15, r12, r5)
            if (r2 == 0) goto La9
            android.animation.PropertyValuesHolder[] r5 = new android.animation.PropertyValuesHolder[r6]
            r5[r9] = r2
            r1.setValues(r5)
        La9:
            r1.setDuration(r7)
            r1.setStartDelay(r10)
            java.lang.String r2 = "repeatCount"
            boolean r2 = p065e0.C1505j.m4094h(r3, r2)
            if (r2 != 0) goto Lb9
            r2 = 0
            goto Lbd
        Lb9:
            int r2 = r4.getInt(r14, r9)
        Lbd:
            r1.setRepeatCount(r2)
            java.lang.String r2 = "repeatMode"
            boolean r2 = p065e0.C1505j.m4094h(r3, r2)
            if (r2 != 0) goto Lca
            r2 = 1
            goto Lce
        Lca:
            int r2 = r4.getInt(r13, r6)
        Lce:
            r1.setRepeatMode(r2)
            if (r0 == 0) goto L1d4
            r2 = r1
            android.animation.ObjectAnimator r2 = (android.animation.ObjectAnimator) r2
            java.lang.String r5 = "pathData"
            java.lang.String r5 = p065e0.C1505j.m4090d(r0, r3, r5, r6)
            if (r5 == 0) goto L1c6
            java.lang.String r7 = "propertyXName"
            r8 = 2
            java.lang.String r7 = p065e0.C1505j.m4090d(r0, r3, r7, r8)
            java.lang.String r8 = "propertyYName"
            java.lang.String r8 = p065e0.C1505j.m4090d(r0, r3, r8, r14)
            if (r7 != 0) goto L10b
            if (r8 == 0) goto Lf0
            goto L10b
        Lf0:
            android.view.InflateException r1 = new android.view.InflateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r0.getPositionDescription()
            r2.append(r0)
            java.lang.String r0 = " propertyXName or propertyYName is needed for PathData"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L10b:
            android.graphics.Path r5 = p084f0.C1941d.m4833d(r5)
            r10 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 * r24
            android.graphics.PathMeasure r11 = new android.graphics.PathMeasure
            r11.<init>(r5, r9)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r13 = 0
            java.lang.Float r14 = java.lang.Float.valueOf(r13)
            r12.add(r14)
            r14 = 0
        L126:
            float r15 = r11.getLength()
            float r14 = r14 + r15
            java.lang.Float r15 = java.lang.Float.valueOf(r14)
            r12.add(r15)
            boolean r15 = r11.nextContour()
            if (r15 != 0) goto L126
            android.graphics.PathMeasure r11 = new android.graphics.PathMeasure
            r11.<init>(r5, r9)
            r5 = 100
            float r10 = r14 / r10
            int r10 = (int) r10
            int r10 = r10 + r6
            int r5 = java.lang.Math.min(r5, r10)
            float[] r10 = new float[r5]
            float[] r15 = new float[r5]
            r13 = 2
            float[] r6 = new float[r13]
            int r13 = r5 + (-1)
            float r13 = (float) r13
            float r14 = r14 / r13
            r16 = r1
            r17 = r4
            r1 = 0
            r13 = 0
        L158:
            r4 = 0
            if (r9 >= r5) goto L196
            java.lang.Object r18 = r12.get(r1)
            java.lang.Float r18 = (java.lang.Float) r18
            float r18 = r18.floatValue()
            r24 = r5
            float r5 = r13 - r18
            r11.getPosTan(r5, r6, r4)
            r4 = 0
            r5 = r6[r4]
            r10[r9] = r5
            r4 = 1
            r5 = r6[r4]
            r15[r9] = r5
            float r13 = r13 + r14
            int r4 = r1 + 1
            int r5 = r12.size()
            if (r4 >= r5) goto L191
            java.lang.Object r5 = r12.get(r4)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 <= 0) goto L191
            r11.nextContour()
            r1 = r4
        L191:
            int r9 = r9 + 1
            r5 = r24
            goto L158
        L196:
            if (r7 == 0) goto L19d
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofFloat(r7, r10)
            goto L19e
        L19d:
            r1 = r4
        L19e:
            if (r8 == 0) goto L1a4
            android.animation.PropertyValuesHolder r4 = android.animation.PropertyValuesHolder.ofFloat(r8, r15)
        L1a4:
            r6 = 1
            if (r1 != 0) goto L1b0
            android.animation.PropertyValuesHolder[] r1 = new android.animation.PropertyValuesHolder[r6]
            r9 = 0
            r1[r9] = r4
            r2.setValues(r1)
            goto L1d8
        L1b0:
            r9 = 0
            if (r4 != 0) goto L1bb
            android.animation.PropertyValuesHolder[] r4 = new android.animation.PropertyValuesHolder[r6]
            r4[r9] = r1
            r2.setValues(r4)
            goto L1d8
        L1bb:
            r13 = 2
            android.animation.PropertyValuesHolder[] r5 = new android.animation.PropertyValuesHolder[r13]
            r5[r9] = r1
            r5[r6] = r4
            r2.setValues(r5)
            goto L1d8
        L1c6:
            r16 = r1
            r17 = r4
            java.lang.String r1 = "propertyName"
            java.lang.String r1 = p065e0.C1505j.m4090d(r0, r3, r1, r9)
            r2.setPropertyName(r1)
            goto L1d8
        L1d4:
            r16 = r1
            r17 = r4
        L1d8:
            java.lang.String r1 = "interpolator"
            boolean r1 = p065e0.C1505j.m4094h(r3, r1)
            if (r1 != 0) goto L1e3
            r1 = r17
            goto L1e9
        L1e3:
            r1 = r17
            int r9 = r1.getResourceId(r9, r9)
        L1e9:
            if (r9 <= 0) goto L1f7
            r2 = r19
            android.view.animation.Interpolator r2 = android.view.animation.AnimationUtils.loadInterpolator(r2, r9)
            r3 = r16
            r3.setInterpolator(r2)
            goto L1f9
        L1f7:
            r3 = r16
        L1f9:
            r1.recycle()
            if (r0 == 0) goto L201
            r0.recycle()
        L201:
            return r3
    }
}
