package p365v;

/* renamed from: v.f */
/* loaded from: classes.dex */
public class C6479f extends p365v.C6475b {

    /* renamed from: f */
    public p365v.C6481h[] f25100f;

    /* renamed from: g */
    public p365v.C6481h[] f25101g;

    /* renamed from: h */
    public int f25102h;

    /* renamed from: i */
    public p365v.C6479f.b f25103i;

    /* renamed from: v.f$a */
    public class a implements java.util.Comparator<p365v.C6481h> {
        public a(p365v.C6479f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public int compare(p365v.C6481h r1, p365v.C6481h r2) {
                r0 = this;
                v.h r1 = (p365v.C6481h) r1
                v.h r2 = (p365v.C6481h) r2
                int r1 = r1.f25108b
                int r2 = r2.f25108b
                int r1 = r1 - r2
                return r1
        }
    }

    /* renamed from: v.f$b */
    public class b implements java.lang.Comparable {

        /* renamed from: Y */
        public p365v.C6481h f25104Y;

        /* renamed from: Z */
        public final /* synthetic */ p365v.C6479f f25105Z;

        public b(p365v.C6479f r1, p365v.C6479f r2) {
                r0 = this;
                r0.f25105Z = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Comparable
        public int compareTo(java.lang.Object r2) {
                r1 = this;
                v.h r2 = (p365v.C6481h) r2
                v.h r0 = r1.f25104Y
                int r0 = r0.f25108b
                int r2 = r2.f25108b
                int r0 = r0 - r2
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                v.h r0 = r3.f25104Y
                java.lang.String r1 = "[ "
                if (r0 == 0) goto L24
                r0 = 0
            L7:
                r2 = 9
                if (r0 >= r2) goto L24
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                v.h r2 = r3.f25104Y
                float[] r2 = r2.f25114h
                r2 = r2[r0]
                r1.append(r2)
                java.lang.String r2 = " "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                int r0 = r0 + 1
                goto L7
            L24:
                java.lang.String r0 = "] "
                java.lang.StringBuilder r0 = android.support.v4.media.C0143b.m255a(r1, r0)
                v.h r1 = r3.f25104Y
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public C6479f(p365v.C6476c r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 128(0x80, float:1.8E-43)
            v.h[] r0 = new p365v.C6481h[r2]
            r1.f25100f = r0
            v.h[] r2 = new p365v.C6481h[r2]
            r1.f25101g = r2
            r2 = 0
            r1.f25102h = r2
            v.f$b r2 = new v.f$b
            r2.<init>(r1, r1)
            r1.f25103i = r2
            return
    }

    @Override // p365v.C6475b, p365v.C6477d.a
    /* renamed from: a */
    public p365v.C6481h mo13100a(p365v.C6477d r11, boolean[] r12) {
            r10 = this;
            r11 = 0
            r0 = -1
            r1 = 0
            r2 = -1
        L4:
            int r3 = r10.f25102h
            if (r1 >= r3) goto L57
            v.h[] r3 = r10.f25100f
            r4 = r3[r1]
            int r5 = r4.f25108b
            boolean r5 = r12[r5]
            if (r5 == 0) goto L13
            goto L54
        L13:
            v.f$b r5 = r10.f25103i
            r5.f25104Y = r4
            r4 = 8
            r6 = 1
            if (r2 != r0) goto L36
        L1c:
            if (r4 < 0) goto L32
            v.h r3 = r5.f25104Y
            float[] r3 = r3.f25114h
            r3 = r3[r4]
            r7 = 0
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 <= 0) goto L2a
            goto L32
        L2a:
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L2f
            goto L33
        L2f:
            int r4 = r4 + (-1)
            goto L1c
        L32:
            r6 = 0
        L33:
            if (r6 == 0) goto L54
            goto L53
        L36:
            r3 = r3[r2]
        L38:
            if (r4 < 0) goto L50
            float[] r7 = r3.f25114h
            r7 = r7[r4]
            v.h r8 = r5.f25104Y
            float[] r8 = r8.f25114h
            r8 = r8[r4]
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 != 0) goto L4b
            int r4 = r4 + (-1)
            goto L38
        L4b:
            int r3 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r3 >= 0) goto L50
            goto L51
        L50:
            r6 = 0
        L51:
            if (r6 == 0) goto L54
        L53:
            r2 = r1
        L54:
            int r1 = r1 + 1
            goto L4
        L57:
            if (r2 != r0) goto L5b
            r11 = 0
            return r11
        L5b:
            v.h[] r11 = r10.f25100f
            r11 = r11[r2]
            return r11
    }

    @Override // p365v.C6475b, p365v.C6477d.a
    /* renamed from: b */
    public void mo13101b(p365v.C6481h r4) {
            r3 = this;
            v.f$b r0 = r3.f25103i
            r0.f25104Y = r4
            float[] r0 = r4.f25114h
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            float[] r0 = r4.f25114h
            int r1 = r4.f25110d
            r2 = 1065353216(0x3f800000, float:1.0)
            r0[r1] = r2
            r3.m13145m(r4)
            return
    }

    @Override // p365v.C6475b, p365v.C6477d.a
    public void clear() {
            r1 = this;
            r0 = 0
            r1.f25102h = r0
            r0 = 0
            r1.f25071b = r0
            return
    }

    @Override // p365v.C6475b, p365v.C6477d.a
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.f25102h
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // p365v.C6475b
    /* renamed from: l */
    public void mo13111l(p365v.C6477d r18, p365v.C6475b r19, boolean r20) {
            r17 = this;
            r0 = r17
            r1 = r19
            v.h r2 = r1.f25070a
            if (r2 != 0) goto L9
            return
        L9:
            v.b$a r3 = r1.f25073d
            int r4 = r3.mo13092d()
            r6 = 0
        L10:
            if (r6 >= r4) goto L94
            v.h r7 = r3.mo13096h(r6)
            float r8 = r3.mo13089a(r6)
            v.f$b r9 = r0.f25103i
            r9.f25104Y = r7
            boolean r10 = r7.f25107a
            r11 = 953267991(0x38d1b717, float:1.0E-4)
            r12 = 9
            r13 = 0
            r14 = 1
            if (r10 == 0) goto L5c
            r10 = 0
        L2a:
            if (r10 >= r12) goto L51
            v.h r15 = r9.f25104Y
            float[] r15 = r15.f25114h
            r16 = r15[r10]
            float[] r5 = r2.f25114h
            r5 = r5[r10]
            float r5 = r5 * r8
            float r5 = r5 + r16
            r15[r10] = r5
            r5 = r15[r10]
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L4d
            v.h r5 = r9.f25104Y
            float[] r5 = r5.f25114h
            r5[r10] = r13
            goto L4e
        L4d:
            r14 = 0
        L4e:
            int r10 = r10 + 1
            goto L2a
        L51:
            if (r14 == 0) goto L5a
            v.f r5 = r9.f25105Z
            v.h r9 = r9.f25104Y
            r5.m13146n(r9)
        L5a:
            r14 = 0
            goto L82
        L5c:
            r5 = 0
        L5d:
            if (r5 >= r12) goto L82
            float[] r10 = r2.f25114h
            r10 = r10[r5]
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 == 0) goto L79
            float r10 = r10 * r8
            float r15 = java.lang.Math.abs(r10)
            int r15 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r15 >= 0) goto L72
            r10 = 0
        L72:
            v.h r15 = r9.f25104Y
            float[] r15 = r15.f25114h
            r15[r5] = r10
            goto L7f
        L79:
            v.h r10 = r9.f25104Y
            float[] r10 = r10.f25114h
            r10[r5] = r13
        L7f:
            int r5 = r5 + 1
            goto L5d
        L82:
            if (r14 == 0) goto L87
            r0.m13145m(r7)
        L87:
            float r5 = r0.f25071b
            float r7 = r1.f25071b
            float r7 = r7 * r8
            float r7 = r7 + r5
            r0.f25071b = r7
            int r6 = r6 + 1
            goto L10
        L94:
            r0.m13146n(r2)
            return
    }

    /* renamed from: m */
    public final void m13145m(p365v.C6481h r6) {
            r5 = this;
            int r0 = r5.f25102h
            r1 = 1
            int r0 = r0 + r1
            v.h[] r2 = r5.f25100f
            int r3 = r2.length
            if (r0 <= r3) goto L1f
            int r0 = r2.length
            int r0 = r0 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            v.h[] r0 = (p365v.C6481h[]) r0
            r5.f25100f = r0
            int r2 = r0.length
            int r2 = r2 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            v.h[] r0 = (p365v.C6481h[]) r0
            r5.f25101g = r0
        L1f:
            v.h[] r0 = r5.f25100f
            int r2 = r5.f25102h
            r0[r2] = r6
            int r2 = r2 + r1
            r5.f25102h = r2
            if (r2 <= r1) goto L5d
            int r2 = r2 - r1
            r0 = r0[r2]
            int r0 = r0.f25108b
            int r2 = r6.f25108b
            if (r0 <= r2) goto L5d
            r0 = 0
            r2 = 0
        L35:
            int r3 = r5.f25102h
            if (r2 >= r3) goto L44
            v.h[] r3 = r5.f25101g
            v.h[] r4 = r5.f25100f
            r4 = r4[r2]
            r3[r2] = r4
            int r2 = r2 + 1
            goto L35
        L44:
            v.h[] r2 = r5.f25101g
            v.f$a r4 = new v.f$a
            r4.<init>(r5)
            java.util.Arrays.sort(r2, r0, r3, r4)
        L4e:
            int r2 = r5.f25102h
            if (r0 >= r2) goto L5d
            v.h[] r2 = r5.f25100f
            v.h[] r3 = r5.f25101g
            r3 = r3[r0]
            r2[r0] = r3
            int r0 = r0 + 1
            goto L4e
        L5d:
            r6.f25107a = r1
            r6.m13155a(r5)
            return
    }

    /* renamed from: n */
    public final void m13146n(p365v.C6481h r6) {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r5.f25102h
            if (r1 >= r2) goto L26
            v.h[] r2 = r5.f25100f
            r2 = r2[r1]
            if (r2 != r6) goto L23
        Lc:
            int r2 = r5.f25102h
            int r3 = r2 + (-1)
            if (r1 >= r3) goto L1c
            v.h[] r2 = r5.f25100f
            int r3 = r1 + 1
            r4 = r2[r3]
            r2[r1] = r4
            r1 = r3
            goto Lc
        L1c:
            int r2 = r2 + (-1)
            r5.f25102h = r2
            r6.f25107a = r0
            return
        L23:
            int r1 = r1 + 1
            goto L2
        L26:
            return
    }

    @Override // p365v.C6475b
    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = " goal -> ("
            java.lang.StringBuilder r0 = android.support.v4.media.C0143b.m255a(r0, r1)
            float r1 = r4.f25071b
            r0.append(r1)
            java.lang.String r1 = ") : "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
        L17:
            int r2 = r4.f25102h
            if (r1 >= r2) goto L38
            v.h[] r2 = r4.f25100f
            r2 = r2[r1]
            v.f$b r3 = r4.f25103i
            r3.f25104Y = r2
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            v.f$b r2 = r4.f25103i
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            int r1 = r1 + 1
            goto L17
        L38:
            return r0
    }
}
