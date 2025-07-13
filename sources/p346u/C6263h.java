package p346u;

/* renamed from: u.h */
/* loaded from: classes.dex */
public class C6263h extends p346u.AbstractC6264i {

    /* renamed from: f */
    public java.lang.String f24304f;

    /* renamed from: g */
    public int f24305g;

    /* renamed from: h */
    public int f24306h;

    /* renamed from: i */
    public float f24307i;

    /* renamed from: j */
    public float f24308j;

    /* renamed from: k */
    public float f24309k;

    /* renamed from: l */
    public float f24310l;

    /* renamed from: m */
    public int f24311m;

    /* renamed from: u.h$a */
    public static class a {

        /* renamed from: a */
        public static android.util.SparseIntArray f24312a;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                p346u.C6263h.a.f24312a = r0
                r1 = 4
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = p346u.C6263h.a.f24312a
                r3 = 2
                r0.append(r3, r3)
                android.util.SparseIntArray r0 = p346u.C6263h.a.f24312a
                r3 = 11
                r4 = 3
                r0.append(r3, r4)
                android.util.SparseIntArray r0 = p346u.C6263h.a.f24312a
                r5 = 0
                r0.append(r5, r1)
                android.util.SparseIntArray r0 = p346u.C6263h.a.f24312a
                r1 = 5
                r0.append(r2, r1)
                android.util.SparseIntArray r0 = p346u.C6263h.a.f24312a
                r2 = 8
                r5 = 6
                r0.append(r2, r5)
                android.util.SparseIntArray r0 = p346u.C6263h.a.f24312a
                r6 = 9
                r7 = 7
                r0.append(r6, r7)
                android.util.SparseIntArray r0 = p346u.C6263h.a.f24312a
                r0.append(r4, r6)
                android.util.SparseIntArray r0 = p346u.C6263h.a.f24312a
                r4 = 10
                r0.append(r4, r2)
                android.util.SparseIntArray r0 = p346u.C6263h.a.f24312a
                r0.append(r7, r3)
                android.util.SparseIntArray r0 = p346u.C6263h.a.f24312a
                r2 = 12
                r0.append(r5, r2)
                android.util.SparseIntArray r0 = p346u.C6263h.a.f24312a
                r0.append(r1, r4)
                return
        }
    }

    public C6263h() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f24304f = r0
            r0 = -1
            r2.f24305g = r0
            r0 = 0
            r2.f24306h = r0
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2.f24307i = r1
            r2.f24308j = r1
            r2.f24309k = r1
            r2.f24310l = r1
            r2.f24311m = r0
            return
    }

    @Override // p346u.AbstractC6258c
    /* renamed from: a */
    public void mo12874a(java.util.HashMap<java.lang.String, p346u.AbstractC6273r> r1) {
            r0 = this;
            return
    }

    @Override // p346u.AbstractC6258c
    /* renamed from: c */
    public void mo12876c(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            int[] r0 = p422y.C7096f.f27461g
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r9, r0)
            android.util.SparseIntArray r9 = p346u.C6263h.a.f24312a
            int r9 = r8.getIndexCount()
            r0 = 0
            r1 = 0
        Le:
            java.lang.String r2 = "KeyPosition"
            r3 = -1
            if (r1 >= r9) goto Le5
            int r4 = r8.getIndex(r1)
            android.util.SparseIntArray r5 = p346u.C6263h.a.f24312a
            int r5 = r5.get(r4)
            r6 = 3
            switch(r5) {
                case 1: goto Lbb;
                case 2: goto Lb2;
                case 3: goto L9a;
                case 4: goto L91;
                case 5: goto L88;
                case 6: goto L7f;
                case 7: goto L76;
                case 8: goto L6a;
                case 9: goto L60;
                case 10: goto L56;
                case 11: goto L4c;
                case 12: goto L45;
                default: goto L21;
            }
        L21:
            java.lang.String r3 = "unused attribute 0x"
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            java.lang.String r5 = java.lang.Integer.toHexString(r4)
            r3.append(r5)
            java.lang.String r5 = "   "
            r3.append(r5)
            android.util.SparseIntArray r5 = p346u.C6263h.a.f24312a
            int r4 = r5.get(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r2, r3)
            goto Le1
        L45:
            float r2 = r7.f24308j
            float r2 = r8.getFloat(r4, r2)
            goto L72
        L4c:
            float r2 = r7.f24307i
            float r2 = r8.getFloat(r4, r2)
            r7.f24307i = r2
            goto Le1
        L56:
            int r2 = r7.f24305g
            int r2 = r8.getInt(r4, r2)
            r7.f24305g = r2
            goto Le1
        L60:
            int r2 = r7.f24311m
            int r2 = r8.getInt(r4, r2)
            r7.f24311m = r2
            goto Le1
        L6a:
            float r2 = r7.f24308j
            float r2 = r8.getFloat(r4, r2)
            r7.f24307i = r2
        L72:
            r7.f24308j = r2
            goto Le1
        L76:
            float r2 = r7.f24310l
            float r2 = r8.getFloat(r4, r2)
            r7.f24310l = r2
            goto Le1
        L7f:
            float r2 = r7.f24309k
            float r2 = r8.getFloat(r4, r2)
            r7.f24309k = r2
            goto Le1
        L88:
            int r2 = r7.f24306h
            int r2 = r8.getInt(r4, r2)
            r7.f24306h = r2
            goto Le1
        L91:
            int r2 = r7.f24313e
            int r2 = r8.getInteger(r4, r2)
            r7.f24313e = r2
            goto Le1
        L9a:
            android.util.TypedValue r2 = r8.peekValue(r4)
            int r2 = r2.type
            if (r2 != r6) goto La7
            java.lang.String r2 = r8.getString(r4)
            goto Laf
        La7:
            java.lang.String[] r2 = p331t.C6088c.f23474c
            int r3 = r8.getInteger(r4, r0)
            r2 = r2[r3]
        Laf:
            r7.f24304f = r2
            goto Le1
        Lb2:
            int r2 = r7.f24245a
            int r2 = r8.getInt(r4, r2)
            r7.f24245a = r2
            goto Le1
        Lbb:
            boolean r2 = androidx.constraintlayout.motion.widget.MotionLayout.f1521x1
            if (r2 == 0) goto Lca
            int r2 = r7.f24246b
            int r2 = r8.getResourceId(r4, r2)
            r7.f24246b = r2
            if (r2 != r3) goto Le1
            goto Ld2
        Lca:
            android.util.TypedValue r2 = r8.peekValue(r4)
            int r2 = r2.type
            if (r2 != r6) goto Ld9
        Ld2:
            java.lang.String r2 = r8.getString(r4)
            r7.f24247c = r2
            goto Le1
        Ld9:
            int r2 = r7.f24246b
            int r2 = r8.getResourceId(r4, r2)
            r7.f24246b = r2
        Le1:
            int r1 = r1 + 1
            goto Le
        Le5:
            int r8 = r7.f24245a
            if (r8 != r3) goto Lee
            java.lang.String r8 = "no frame position"
            android.util.Log.e(r2, r8)
        Lee:
            return
    }
}
