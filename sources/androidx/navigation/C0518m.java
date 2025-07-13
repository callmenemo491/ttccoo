package androidx.navigation;

/* renamed from: androidx.navigation.m */
/* loaded from: classes.dex */
public class C0518m {

    /* renamed from: Y */
    public final java.lang.String f2971Y;

    /* renamed from: Z */
    public androidx.navigation.C0520o f2972Z;

    /* renamed from: a0 */
    public int f2973a0;

    /* renamed from: b0 */
    public java.lang.String f2974b0;

    /* renamed from: c0 */
    public java.lang.CharSequence f2975c0;

    /* renamed from: d0 */
    public java.util.ArrayList<androidx.navigation.C0517l> f2976d0;

    /* renamed from: e0 */
    public p319s.C5942i<androidx.navigation.C0505d> f2977e0;

    /* renamed from: f0 */
    public java.util.HashMap<java.lang.String, androidx.navigation.C0513h> f2978f0;

    /* renamed from: androidx.navigation.m$a */
    public static class a implements java.lang.Comparable<androidx.navigation.C0518m.a> {

        /* renamed from: Y */
        public final androidx.navigation.C0518m f2979Y;

        /* renamed from: Z */
        public final android.os.Bundle f2980Z;

        /* renamed from: a0 */
        public final boolean f2981a0;

        /* renamed from: b0 */
        public final boolean f2982b0;

        /* renamed from: c0 */
        public final int f2983c0;

        public a(androidx.navigation.C0518m r1, android.os.Bundle r2, boolean r3, boolean r4, int r5) {
                r0 = this;
                r0.<init>()
                r0.f2979Y = r1
                r0.f2980Z = r2
                r0.f2981a0 = r3
                r0.f2982b0 = r4
                r0.f2983c0 = r5
                return
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(androidx.navigation.C0518m.a r1) {
                r0 = this;
                androidx.navigation.m$a r1 = (androidx.navigation.C0518m.a) r1
                int r1 = r0.m1595e(r1)
                return r1
        }

        /* renamed from: e */
        public int m1595e(androidx.navigation.C0518m.a r5) {
                r4 = this;
                boolean r0 = r4.f2981a0
                r1 = 1
                if (r0 == 0) goto La
                boolean r2 = r5.f2981a0
                if (r2 != 0) goto La
                return r1
            La:
                r2 = -1
                if (r0 != 0) goto L12
                boolean r0 = r5.f2981a0
                if (r0 == 0) goto L12
                return r2
            L12:
                android.os.Bundle r0 = r4.f2980Z
                if (r0 == 0) goto L1b
                android.os.Bundle r3 = r5.f2980Z
                if (r3 != 0) goto L1b
                return r1
            L1b:
                if (r0 != 0) goto L22
                android.os.Bundle r3 = r5.f2980Z
                if (r3 == 0) goto L22
                return r2
            L22:
                if (r0 == 0) goto L35
                int r0 = r0.size()
                android.os.Bundle r3 = r5.f2980Z
                int r3 = r3.size()
                int r0 = r0 - r3
                if (r0 <= 0) goto L32
                return r1
            L32:
                if (r0 >= 0) goto L35
                return r2
            L35:
                boolean r0 = r4.f2982b0
                if (r0 == 0) goto L3e
                boolean r3 = r5.f2982b0
                if (r3 != 0) goto L3e
                return r1
            L3e:
                if (r0 != 0) goto L45
                boolean r0 = r5.f2982b0
                if (r0 == 0) goto L45
                return r2
            L45:
                int r0 = r4.f2983c0
                int r5 = r5.f2983c0
                int r0 = r0 - r5
                return r0
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return
    }

    public C0518m(androidx.navigation.AbstractC0527v<? extends androidx.navigation.C0518m> r1) {
            r0 = this;
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = androidx.navigation.C0528w.m1610b(r1)
            r0.<init>()
            r0.f2971Y = r1
            return
    }

    /* renamed from: h */
    public static java.lang.String m1591h(android.content.Context r1, int r2) {
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r2 > r0) goto La
            java.lang.String r1 = java.lang.Integer.toString(r2)
            return r1
        La:
            android.content.res.Resources r1 = r1.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L13
            java.lang.String r1 = r1.getResourceName(r2)     // Catch: android.content.res.Resources.NotFoundException -> L13
            return r1
        L13:
            java.lang.String r1 = java.lang.Integer.toString(r2)
            return r1
    }

    /* renamed from: a */
    public android.os.Bundle m1592a(android.os.Bundle r7) {
            r6 = this;
            if (r7 != 0) goto Le
            java.util.HashMap<java.lang.String, androidx.navigation.h> r0 = r6.f2978f0
            if (r0 == 0) goto Lc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le
        Lc:
            r7 = 0
            return r7
        Le:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.HashMap<java.lang.String, androidx.navigation.h> r1 = r6.f2978f0
            if (r1 == 0) goto L43
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            androidx.navigation.h r3 = (androidx.navigation.C0513h) r3
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            boolean r4 = r3.f2941c
            if (r4 == 0) goto L1f
            androidx.navigation.t r4 = r3.f2939a
            java.lang.Object r3 = r3.f2942d
            r4.mo1606d(r0, r2, r3)
            goto L1f
        L43:
            if (r7 == 0) goto Lbb
            r0.putAll(r7)
            java.util.HashMap<java.lang.String, androidx.navigation.h> r7 = r6.f2978f0
            if (r7 == 0) goto Lbb
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L54:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lbb
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            androidx.navigation.h r2 = (androidx.navigation.C0513h) r2
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r2.f2940b
            r5 = 0
            if (r4 != 0) goto L7e
            boolean r4 = r0.containsKey(r3)
            if (r4 == 0) goto L7e
            java.lang.Object r4 = r0.get(r3)
            if (r4 != 0) goto L7e
            goto L86
        L7e:
            androidx.navigation.t r2 = r2.f2939a     // Catch: java.lang.ClassCastException -> L85
            r2.mo1603a(r0, r3)     // Catch: java.lang.ClassCastException -> L85
            r5 = 1
            goto L86
        L85:
        L86:
            if (r5 == 0) goto L89
            goto L54
        L89:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Wrong argument type for '"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "' in argument bundle. "
            r0.append(r2)
            java.lang.Object r1 = r1.getValue()
            androidx.navigation.h r1 = (androidx.navigation.C0513h) r1
            androidx.navigation.t r1 = r1.f2939a
            java.lang.String r1 = r1.mo1604b()
            r0.append(r1)
            java.lang.String r1 = " expected."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        Lbb:
            return r0
    }

    /* renamed from: e */
    public final androidx.navigation.C0505d m1593e(int r3) {
            r2 = this;
            s.i<androidx.navigation.d> r0 = r2.f2977e0
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Ld
        L7:
            java.lang.Object r0 = r0.m12349e(r3, r1)
            androidx.navigation.d r0 = (androidx.navigation.C0505d) r0
        Ld:
            if (r0 == 0) goto L11
            r1 = r0
            goto L19
        L11:
            androidx.navigation.o r0 = r2.f2972Z
            if (r0 == 0) goto L19
            androidx.navigation.d r1 = r0.m1593e(r3)
        L19:
            return r1
    }

    /* renamed from: i */
    public androidx.navigation.C0518m.a mo1594i(androidx.fragment.app.C0392l0 r19) {
            r18 = this;
            r6 = r18
            r7 = r19
            java.util.ArrayList<androidx.navigation.l> r0 = r6.f2976d0
            r8 = 0
            if (r0 != 0) goto La
            return r8
        La:
            java.util.Iterator r9 = r0.iterator()
            r10 = r8
        Lf:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L14f
            java.lang.Object r0 = r9.next()
            androidx.navigation.l r0 = (androidx.navigation.C0517l) r0
            java.util.ArrayList<androidx.fragment.app.n> r1 = r7.f2230Z
            android.net.Uri r1 = (android.net.Uri) r1
            if (r1 == 0) goto Lf3
            java.util.HashMap<java.lang.String, androidx.navigation.h> r3 = r6.f2978f0
            if (r3 != 0) goto L2a
            java.util.Map r3 = java.util.Collections.emptyMap()
            goto L2e
        L2a:
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)
        L2e:
            java.util.regex.Pattern r4 = r0.f2961c
            java.lang.String r5 = r1.toString()
            java.util.regex.Matcher r4 = r4.matcher(r5)
            boolean r5 = r4.matches()
            if (r5 != 0) goto L41
        L3e:
            r5 = r8
            goto Lf1
        L41:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.util.ArrayList<java.lang.String> r11 = r0.f2959a
            int r11 = r11.size()
            r12 = 0
        L4d:
            if (r12 >= r11) goto L6e
            java.util.ArrayList<java.lang.String> r13 = r0.f2959a
            java.lang.Object r13 = r13.get(r12)
            java.lang.String r13 = (java.lang.String) r13
            int r12 = r12 + 1
            java.lang.String r14 = r4.group(r12)
            java.lang.String r14 = android.net.Uri.decode(r14)
            java.lang.Object r15 = r3.get(r13)
            androidx.navigation.h r15 = (androidx.navigation.C0513h) r15
            boolean r13 = r0.m1589b(r5, r13, r14, r15)
            if (r13 == 0) goto L4d
            goto L3e
        L6e:
            boolean r4 = r0.f2963e
            if (r4 == 0) goto Lf1
            java.util.Map<java.lang.String, androidx.navigation.l$b> r4 = r0.f2960b
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r4 = r4.iterator()
        L7c:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto Lf1
            java.lang.Object r11 = r4.next()
            java.lang.String r11 = (java.lang.String) r11
            java.util.Map<java.lang.String, androidx.navigation.l$b> r12 = r0.f2960b
            java.lang.Object r12 = r12.get(r11)
            androidx.navigation.l$b r12 = (androidx.navigation.C0517l.b) r12
            java.lang.String r11 = r1.getQueryParameter(r11)
            if (r11 == 0) goto La7
            java.lang.String r13 = r12.f2969a
            java.util.regex.Pattern r13 = java.util.regex.Pattern.compile(r13)
            java.util.regex.Matcher r11 = r13.matcher(r11)
            boolean r13 = r11.matches()
            if (r13 != 0) goto La8
            goto L3e
        La7:
            r11 = r8
        La8:
            r13 = 0
        La9:
            java.util.ArrayList<java.lang.String> r14 = r12.f2970b
            int r14 = r14.size()
            if (r13 >= r14) goto L7c
            if (r11 == 0) goto Lbe
            int r14 = r13 + 1
            java.lang.String r14 = r11.group(r14)
            java.lang.String r14 = android.net.Uri.decode(r14)
            goto Lbf
        Lbe:
            r14 = r8
        Lbf:
            java.util.ArrayList<java.lang.String> r15 = r12.f2970b
            java.lang.Object r15 = r15.get(r13)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r16 = r3.get(r15)
            r2 = r16
            androidx.navigation.h r2 = (androidx.navigation.C0513h) r2
            if (r14 == 0) goto Le9
            java.lang.String r8 = "[{}]"
            r17 = r1
            java.lang.String r1 = ""
            java.lang.String r1 = r14.replaceAll(r8, r1)
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto Leb
            boolean r1 = r0.m1589b(r5, r15, r14, r2)
            if (r1 == 0) goto Leb
            r5 = 0
            goto Lf1
        Le9:
            r17 = r1
        Leb:
            int r13 = r13 + 1
            r1 = r17
            r8 = 0
            goto La9
        Lf1:
            r2 = r5
            goto Lf4
        Lf3:
            r2 = 0
        Lf4:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r1 = r7.f2231a0
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L105
            java.lang.String r3 = r0.f2964f
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L105
            r1 = 1
            r4 = 1
            goto L106
        L105:
            r4 = 0
        L106:
            java.lang.Object r1 = r7.f2232b0
            java.lang.String r1 = (java.lang.String) r1
            r3 = -1
            if (r1 == 0) goto L132
            java.lang.String r5 = r0.f2966h
            if (r5 == 0) goto L12f
            java.util.regex.Pattern r5 = r0.f2965g
            java.util.regex.Matcher r5 = r5.matcher(r1)
            boolean r5 = r5.matches()
            if (r5 != 0) goto L11e
            goto L12f
        L11e:
            androidx.navigation.l$a r5 = new androidx.navigation.l$a
            java.lang.String r8 = r0.f2966h
            r5.<init>(r8)
            androidx.navigation.l$a r8 = new androidx.navigation.l$a
            r8.<init>(r1)
            int r1 = r5.m1590e(r8)
            goto L130
        L12f:
            r1 = -1
        L130:
            r5 = r1
            goto L133
        L132:
            r5 = -1
        L133:
            if (r2 != 0) goto L139
            if (r4 != 0) goto L139
            if (r5 <= r3) goto L14c
        L139:
            androidx.navigation.m$a r8 = new androidx.navigation.m$a
            boolean r3 = r0.f2962d
            r0 = r8
            r1 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            if (r10 == 0) goto L14b
            int r0 = r8.m1595e(r10)
            if (r0 <= 0) goto L14c
        L14b:
            r10 = r8
        L14c:
            r8 = 0
            goto Lf
        L14f:
            return r10
    }

    /* renamed from: l */
    public void mo1580l(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            android.content.res.Resources r0 = r4.getResources()
            int[] r1 = p104g1.C2206a.f10103e
            android.content.res.TypedArray r5 = r0.obtainAttributes(r5, r1)
            r0 = 1
            r1 = 0
            int r0 = r5.getResourceId(r0, r1)
            r3.f2973a0 = r0
            r2 = 0
            r3.f2974b0 = r2
            java.lang.String r4 = m1591h(r4, r0)
            r3.f2974b0 = r4
            java.lang.CharSequence r4 = r5.getText(r1)
            r3.f2975c0 = r4
            r5.recycle()
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.String r1 = r2.f2974b0
            if (r1 != 0) goto L24
            java.lang.String r1 = "0x"
            r0.append(r1)
            int r1 = r2.f2973a0
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L24:
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.CharSequence r1 = r2.f2975c0
            if (r1 == 0) goto L3a
            java.lang.String r1 = " label="
            r0.append(r1)
            java.lang.CharSequence r1 = r2.f2975c0
            r0.append(r1)
        L3a:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
