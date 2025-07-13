package p346u;

/* renamed from: u.d */
/* loaded from: classes.dex */
public class C6259d extends p346u.AbstractC6258c {

    /* renamed from: e */
    public int f24249e;

    /* renamed from: f */
    public float f24250f;

    /* renamed from: g */
    public float f24251g;

    /* renamed from: h */
    public float f24252h;

    /* renamed from: i */
    public float f24253i;

    /* renamed from: j */
    public float f24254j;

    /* renamed from: k */
    public float f24255k;

    /* renamed from: l */
    public float f24256l;

    /* renamed from: m */
    public float f24257m;

    /* renamed from: n */
    public float f24258n;

    /* renamed from: o */
    public float f24259o;

    /* renamed from: p */
    public float f24260p;

    /* renamed from: q */
    public float f24261q;

    /* renamed from: r */
    public float f24262r;

    /* renamed from: s */
    public float f24263s;

    /* renamed from: u.d$a */
    public static class a {

        /* renamed from: a */
        public static android.util.SparseIntArray f24264a;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                p346u.C6259d.a.f24264a = r0
                r1 = 0
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = p346u.C6259d.a.f24264a
                r1 = 11
                r3 = 2
                r0.append(r1, r3)
                android.util.SparseIntArray r0 = p346u.C6259d.a.f24264a
                r1 = 7
                r4 = 4
                r0.append(r1, r4)
                android.util.SparseIntArray r0 = p346u.C6259d.a.f24264a
                r5 = 8
                r6 = 5
                r0.append(r5, r6)
                android.util.SparseIntArray r0 = p346u.C6259d.a.f24264a
                r7 = 9
                r8 = 6
                r0.append(r7, r8)
                android.util.SparseIntArray r0 = p346u.C6259d.a.f24264a
                r9 = 19
                r0.append(r2, r9)
                android.util.SparseIntArray r0 = p346u.C6259d.a.f24264a
                r2 = 20
                r0.append(r3, r2)
                android.util.SparseIntArray r0 = p346u.C6259d.a.f24264a
                r0.append(r6, r1)
                android.util.SparseIntArray r0 = p346u.C6259d.a.f24264a
                r1 = 17
                r0.append(r1, r5)
                android.util.SparseIntArray r0 = p346u.C6259d.a.f24264a
                r2 = 16
                r0.append(r2, r7)
                android.util.SparseIntArray r0 = p346u.C6259d.a.f24264a
                r3 = 15
                r5 = 10
                r0.append(r3, r5)
                android.util.SparseIntArray r0 = p346u.C6259d.a.f24264a
                r6 = 13
                r7 = 12
                r0.append(r6, r7)
                android.util.SparseIntArray r0 = p346u.C6259d.a.f24264a
                r0.append(r7, r6)
                android.util.SparseIntArray r0 = p346u.C6259d.a.f24264a
                r6 = 14
                r0.append(r8, r6)
                android.util.SparseIntArray r0 = p346u.C6259d.a.f24264a
                r7 = 3
                r0.append(r7, r3)
                android.util.SparseIntArray r0 = p346u.C6259d.a.f24264a
                r0.append(r4, r2)
                android.util.SparseIntArray r0 = p346u.C6259d.a.f24264a
                r0.append(r5, r1)
                android.util.SparseIntArray r0 = p346u.C6259d.a.f24264a
                r1 = 18
                r0.append(r6, r1)
                return
        }
    }

    public C6259d() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f24249e = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.f24250f = r0
            r1.f24251g = r0
            r1.f24252h = r0
            r1.f24253i = r0
            r1.f24254j = r0
            r1.f24255k = r0
            r1.f24256l = r0
            r1.f24257m = r0
            r1.f24258n = r0
            r1.f24259o = r0
            r1.f24260p = r0
            r1.f24261q = r0
            r1.f24262r = r0
            r1.f24263s = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f24248d = r0
            return
    }

    @Override // p346u.AbstractC6258c
    /* renamed from: a */
    public void mo12874a(java.util.HashMap<java.lang.String, p346u.AbstractC6273r> r6) {
            r5 = this;
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1cf
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r6.get(r1)
            u.r r2 = (p346u.AbstractC6273r) r2
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L3b
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, y.a> r3 = r5.f24248d
            java.lang.Object r1 = r3.get(r1)
            y.a r1 = (p422y.C7091a) r1
            if (r1 == 0) goto L8
            u.r$b r2 = (p346u.AbstractC6273r.b) r2
            int r3 = r5.f24245a
            android.util.SparseArray<y.a> r2 = r2.f24414f
            r2.append(r3, r1)
            goto L8
        L3b:
            int r3 = r1.hashCode()
            switch(r3) {
                case -1249320806: goto Le3;
                case -1249320805: goto Ld8;
                case -1225497657: goto Lcd;
                case -1225497656: goto Lc2;
                case -1225497655: goto Lb7;
                case -1001078227: goto Lac;
                case -908189618: goto La1;
                case -908189617: goto L98;
                case -760884510: goto L8a;
                case -760884509: goto L7c;
                case -40300674: goto L6e;
                case -4379043: goto L60;
                case 37232917: goto L52;
                case 92909918: goto L44;
                default: goto L42;
            }
        L42:
            goto Lee
        L44:
            java.lang.String r3 = "alpha"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L4e
            goto Lee
        L4e:
            r4 = 13
            goto Lef
        L52:
            java.lang.String r3 = "transitionPathRotate"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L5c
            goto Lee
        L5c:
            r4 = 12
            goto Lef
        L60:
            java.lang.String r3 = "elevation"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L6a
            goto Lee
        L6a:
            r4 = 11
            goto Lef
        L6e:
            java.lang.String r3 = "rotation"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L78
            goto Lee
        L78:
            r4 = 10
            goto Lef
        L7c:
            java.lang.String r3 = "transformPivotY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L86
            goto Lee
        L86:
            r4 = 9
            goto Lef
        L8a:
            java.lang.String r3 = "transformPivotX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L94
            goto Lee
        L94:
            r4 = 8
            goto Lef
        L98:
            java.lang.String r3 = "scaleY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lef
            goto Lee
        La1:
            java.lang.String r3 = "scaleX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Laa
            goto Lee
        Laa:
            r4 = 6
            goto Lef
        Lac:
            java.lang.String r3 = "progress"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lb5
            goto Lee
        Lb5:
            r4 = 5
            goto Lef
        Lb7:
            java.lang.String r3 = "translationZ"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lc0
            goto Lee
        Lc0:
            r4 = 4
            goto Lef
        Lc2:
            java.lang.String r3 = "translationY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lcb
            goto Lee
        Lcb:
            r4 = 3
            goto Lef
        Lcd:
            java.lang.String r3 = "translationX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Ld6
            goto Lee
        Ld6:
            r4 = 2
            goto Lef
        Ld8:
            java.lang.String r3 = "rotationY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Le1
            goto Lee
        Le1:
            r4 = 1
            goto Lef
        Le3:
            java.lang.String r3 = "rotationX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lec
            goto Lee
        Lec:
            r4 = 0
            goto Lef
        Lee:
            r4 = -1
        Lef:
            switch(r4) {
                case 0: goto L1be;
                case 1: goto L1b1;
                case 2: goto L1a4;
                case 3: goto L197;
                case 4: goto L18a;
                case 5: goto L17d;
                case 6: goto L170;
                case 7: goto L163;
                case 8: goto L155;
                case 9: goto L147;
                case 10: goto L139;
                case 11: goto L12b;
                case 12: goto L11d;
                case 13: goto L10f;
                default: goto Lf2;
            }
        Lf2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "KeyAttributes"
            android.util.Log.v(r2, r1)
            goto L8
        L10f:
            float r1 = r5.f24250f
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r5.f24245a
            float r3 = r5.f24250f
            goto L1ca
        L11d:
            float r1 = r5.f24257m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r5.f24245a
            float r3 = r5.f24257m
            goto L1ca
        L12b:
            float r1 = r5.f24251g
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r5.f24245a
            float r3 = r5.f24251g
            goto L1ca
        L139:
            float r1 = r5.f24252h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r5.f24245a
            float r3 = r5.f24252h
            goto L1ca
        L147:
            float r1 = r5.f24254j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r5.f24245a
            float r3 = r5.f24256l
            goto L1ca
        L155:
            float r1 = r5.f24253i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r5.f24245a
            float r3 = r5.f24255k
            goto L1ca
        L163:
            float r1 = r5.f24259o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r5.f24245a
            float r3 = r5.f24259o
            goto L1ca
        L170:
            float r1 = r5.f24258n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r5.f24245a
            float r3 = r5.f24258n
            goto L1ca
        L17d:
            float r1 = r5.f24263s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r5.f24245a
            float r3 = r5.f24263s
            goto L1ca
        L18a:
            float r1 = r5.f24262r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r5.f24245a
            float r3 = r5.f24262r
            goto L1ca
        L197:
            float r1 = r5.f24261q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r5.f24245a
            float r3 = r5.f24261q
            goto L1ca
        L1a4:
            float r1 = r5.f24260p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r5.f24245a
            float r3 = r5.f24260p
            goto L1ca
        L1b1:
            float r1 = r5.f24254j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r5.f24245a
            float r3 = r5.f24254j
            goto L1ca
        L1be:
            float r1 = r5.f24253i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r5.f24245a
            float r3 = r5.f24253i
        L1ca:
            r2.mo12900b(r1, r3)
            goto L8
        L1cf:
            return
    }

    @Override // p346u.AbstractC6258c
    /* renamed from: b */
    public void mo12875b(java.util.HashSet<java.lang.String> r5) {
            r4 = this;
            float r0 = r4.f24250f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Ld
            java.lang.String r0 = "alpha"
            r5.add(r0)
        Ld:
            float r0 = r4.f24251g
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "elevation"
            r5.add(r0)
        L1a:
            float r0 = r4.f24252h
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L27
            java.lang.String r0 = "rotation"
            r5.add(r0)
        L27:
            float r0 = r4.f24253i
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L34
            java.lang.String r0 = "rotationX"
            r5.add(r0)
        L34:
            float r0 = r4.f24254j
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L41
            java.lang.String r0 = "rotationY"
            r5.add(r0)
        L41:
            float r0 = r4.f24255k
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "transformPivotX"
            r5.add(r0)
        L4e:
            float r0 = r4.f24256l
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "transformPivotY"
            r5.add(r0)
        L5b:
            float r0 = r4.f24260p
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "translationX"
            r5.add(r0)
        L68:
            float r0 = r4.f24261q
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L75
            java.lang.String r0 = "translationY"
            r5.add(r0)
        L75:
            float r0 = r4.f24262r
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L82
            java.lang.String r0 = "translationZ"
            r5.add(r0)
        L82:
            float r0 = r4.f24257m
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8f
            java.lang.String r0 = "transitionPathRotate"
            r5.add(r0)
        L8f:
            float r0 = r4.f24258n
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L9c
            java.lang.String r0 = "scaleX"
            r5.add(r0)
        L9c:
            float r0 = r4.f24259o
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto La9
            java.lang.String r0 = "scaleY"
            r5.add(r0)
        La9:
            float r0 = r4.f24263s
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb6
            java.lang.String r0 = "progress"
            r5.add(r0)
        Lb6:
            java.util.HashMap<java.lang.String, y.a> r0 = r4.f24248d
            int r0 = r0.size()
            if (r0 <= 0) goto Le9
            java.util.HashMap<java.lang.String, y.a> r0 = r4.f24248d
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lc8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le9
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CUSTOM,"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r5.add(r1)
            goto Lc8
        Le9:
            return
    }

    @Override // p346u.AbstractC6258c
    /* renamed from: c */
    public void mo12876c(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            int[] r0 = p422y.C7096f.f27459e
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r0)
            android.util.SparseIntArray r6 = p346u.C6259d.a.f24264a
            int r6 = r5.getIndexCount()
            r0 = 0
        Ld:
            if (r0 >= r6) goto L10b
            int r1 = r5.getIndex(r0)
            android.util.SparseIntArray r2 = p346u.C6259d.a.f24264a
            int r2 = r2.get(r1)
            switch(r2) {
                case 1: goto Lff;
                case 2: goto Lf6;
                case 3: goto L1c;
                case 4: goto Led;
                case 5: goto Le4;
                case 6: goto Ldb;
                case 7: goto Ld2;
                case 8: goto Lc9;
                case 9: goto Lc5;
                case 10: goto L9c;
                case 11: goto L1c;
                case 12: goto L92;
                case 13: goto L88;
                case 14: goto L7e;
                case 15: goto L74;
                case 16: goto L6a;
                case 17: goto L60;
                case 18: goto L56;
                case 19: goto L4c;
                case 20: goto L42;
                default: goto L1c;
            }
        L1c:
            java.lang.String r2 = "unused attribute 0x"
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String r3 = java.lang.Integer.toHexString(r1)
            r2.append(r3)
            java.lang.String r3 = "   "
            r2.append(r3)
            android.util.SparseIntArray r3 = p346u.C6259d.a.f24264a
            int r1 = r3.get(r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "KeyAttribute"
            android.util.Log.e(r2, r1)
            goto L107
        L42:
            float r2 = r4.f24256l
            float r1 = r5.getDimension(r1, r2)
            r4.f24256l = r1
            goto L107
        L4c:
            float r2 = r4.f24255k
            float r1 = r5.getDimension(r1, r2)
            r4.f24255k = r1
            goto L107
        L56:
            float r2 = r4.f24263s
            float r1 = r5.getFloat(r1, r2)
            r4.f24263s = r1
            goto L107
        L60:
            float r2 = r4.f24262r
            float r1 = r5.getDimension(r1, r2)
            r4.f24262r = r1
            goto L107
        L6a:
            float r2 = r4.f24261q
            float r1 = r5.getDimension(r1, r2)
            r4.f24261q = r1
            goto L107
        L74:
            float r2 = r4.f24260p
            float r1 = r5.getDimension(r1, r2)
            r4.f24260p = r1
            goto L107
        L7e:
            float r2 = r4.f24259o
            float r1 = r5.getFloat(r1, r2)
            r4.f24259o = r1
            goto L107
        L88:
            int r2 = r4.f24249e
            int r1 = r5.getInteger(r1, r2)
            r4.f24249e = r1
            goto L107
        L92:
            int r2 = r4.f24245a
            int r1 = r5.getInt(r1, r2)
            r4.f24245a = r1
            goto L107
        L9c:
            boolean r2 = androidx.constraintlayout.motion.widget.MotionLayout.f1521x1
            if (r2 == 0) goto Lac
            int r2 = r4.f24246b
            int r2 = r5.getResourceId(r1, r2)
            r4.f24246b = r2
            r3 = -1
            if (r2 != r3) goto L107
            goto Lb5
        Lac:
            android.util.TypedValue r2 = r5.peekValue(r1)
            int r2 = r2.type
            r3 = 3
            if (r2 != r3) goto Lbc
        Lb5:
            java.lang.String r1 = r5.getString(r1)
            r4.f24247c = r1
            goto L107
        Lbc:
            int r2 = r4.f24246b
            int r1 = r5.getResourceId(r1, r2)
            r4.f24246b = r1
            goto L107
        Lc5:
            r5.getString(r1)
            goto L107
        Lc9:
            float r2 = r4.f24257m
            float r1 = r5.getFloat(r1, r2)
            r4.f24257m = r1
            goto L107
        Ld2:
            float r2 = r4.f24258n
            float r1 = r5.getFloat(r1, r2)
            r4.f24258n = r1
            goto L107
        Ldb:
            float r2 = r4.f24254j
            float r1 = r5.getFloat(r1, r2)
            r4.f24254j = r1
            goto L107
        Le4:
            float r2 = r4.f24253i
            float r1 = r5.getFloat(r1, r2)
            r4.f24253i = r1
            goto L107
        Led:
            float r2 = r4.f24252h
            float r1 = r5.getFloat(r1, r2)
            r4.f24252h = r1
            goto L107
        Lf6:
            float r2 = r4.f24251g
            float r1 = r5.getDimension(r1, r2)
            r4.f24251g = r1
            goto L107
        Lff:
            float r2 = r4.f24250f
            float r1 = r5.getFloat(r1, r2)
            r4.f24250f = r1
        L107:
            int r0 = r0 + 1
            goto Ld
        L10b:
            return
    }

    @Override // p346u.AbstractC6258c
    /* renamed from: d */
    public void mo12877d(java.util.HashMap<java.lang.String, java.lang.Integer> r4) {
            r3 = this;
            int r0 = r3.f24249e
            r1 = -1
            if (r0 != r1) goto L6
            return
        L6:
            float r0 = r3.f24250f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L19
            int r0 = r3.f24249e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "alpha"
            r4.put(r1, r0)
        L19:
            float r0 = r3.f24251g
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L2c
            int r0 = r3.f24249e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "elevation"
            r4.put(r1, r0)
        L2c:
            float r0 = r3.f24252h
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L3f
            int r0 = r3.f24249e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotation"
            r4.put(r1, r0)
        L3f:
            float r0 = r3.f24253i
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L52
            int r0 = r3.f24249e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotationX"
            r4.put(r1, r0)
        L52:
            float r0 = r3.f24254j
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L65
            int r0 = r3.f24249e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotationY"
            r4.put(r1, r0)
        L65:
            float r0 = r3.f24255k
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L78
            int r0 = r3.f24249e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "transformPivotX"
            r4.put(r1, r0)
        L78:
            float r0 = r3.f24256l
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8b
            int r0 = r3.f24249e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "transformPivotY"
            r4.put(r1, r0)
        L8b:
            float r0 = r3.f24260p
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L9e
            int r0 = r3.f24249e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationX"
            r4.put(r1, r0)
        L9e:
            float r0 = r3.f24261q
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb1
            int r0 = r3.f24249e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationY"
            r4.put(r1, r0)
        Lb1:
            float r0 = r3.f24262r
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lc4
            int r0 = r3.f24249e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationZ"
            r4.put(r1, r0)
        Lc4:
            float r0 = r3.f24257m
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Ld7
            int r0 = r3.f24249e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "transitionPathRotate"
            r4.put(r1, r0)
        Ld7:
            float r0 = r3.f24258n
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lea
            int r0 = r3.f24249e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleX"
            r4.put(r1, r0)
        Lea:
            float r0 = r3.f24259o
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lfd
            int r0 = r3.f24249e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleY"
            r4.put(r1, r0)
        Lfd:
            float r0 = r3.f24263s
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L110
            int r0 = r3.f24249e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "progress"
            r4.put(r1, r0)
        L110:
            java.util.HashMap<java.lang.String, y.a> r0 = r3.f24248d
            int r0 = r0.size()
            if (r0 <= 0) goto L13e
            java.util.HashMap<java.lang.String, y.a> r0 = r3.f24248d
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L122:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L13e
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "CUSTOM,"
            java.lang.String r1 = p064e.C1493g.m4049a(r2, r1)
            int r2 = r3.f24249e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.put(r1, r2)
            goto L122
        L13e:
            return
    }
}
