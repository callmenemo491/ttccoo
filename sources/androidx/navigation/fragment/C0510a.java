package androidx.navigation.fragment;

@androidx.navigation.AbstractC0527v.b("fragment")
/* renamed from: androidx.navigation.fragment.a */
/* loaded from: classes.dex */
public class C0510a extends androidx.navigation.AbstractC0527v<androidx.navigation.fragment.C0510a.a> {

    /* renamed from: a */
    public final android.content.Context f2929a;

    /* renamed from: b */
    public final androidx.fragment.app.AbstractC0375d0 f2930b;

    /* renamed from: c */
    public final int f2931c;

    /* renamed from: d */
    public java.util.ArrayDeque<java.lang.Integer> f2932d;

    /* renamed from: androidx.navigation.fragment.a$a */
    public static class a extends androidx.navigation.C0518m {

        /* renamed from: g0 */
        public java.lang.String f2933g0;

        public a(androidx.navigation.AbstractC0527v<? extends androidx.navigation.fragment.C0510a.a> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.navigation.C0518m
        /* renamed from: l */
        public void mo1580l(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                super.mo1580l(r2, r3)
                android.content.res.Resources r2 = r2.getResources()
                int[] r0 = androidx.navigation.fragment.C0511b.f2935b
                android.content.res.TypedArray r2 = r2.obtainAttributes(r3, r0)
                r3 = 0
                java.lang.String r3 = r2.getString(r3)
                if (r3 == 0) goto L16
                r1.f2933g0 = r3
            L16:
                r2.recycle()
                return
        }

        @Override // androidx.navigation.C0518m
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = super.toString()
                r0.append(r1)
                java.lang.String r1 = " class="
                r0.append(r1)
                java.lang.String r1 = r2.f2933g0
                if (r1 != 0) goto L17
                java.lang.String r1 = "null"
            L17:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: androidx.navigation.fragment.a$b */
    public static final class b implements androidx.navigation.AbstractC0527v.a {
    }

    public C0510a(android.content.Context r2, androidx.fragment.app.AbstractC0375d0 r3, int r4) {
            r1 = this;
            r1.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.f2932d = r0
            r1.f2929a = r2
            r1.f2930b = r3
            r1.f2931c = r4
            return
    }

    @Override // androidx.navigation.AbstractC0527v
    /* renamed from: a */
    public androidx.navigation.C0518m mo1577a() {
            r1 = this;
            androidx.navigation.fragment.a$a r0 = new androidx.navigation.fragment.a$a
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.navigation.AbstractC0527v
    /* renamed from: b */
    public androidx.navigation.C0518m mo1578b(androidx.navigation.C0518m r9, android.os.Bundle r10, androidx.navigation.C0524s r11, androidx.navigation.AbstractC0527v.a r12) {
            r8 = this;
            androidx.navigation.fragment.a$a r9 = (androidx.navigation.fragment.C0510a.a) r9
            androidx.fragment.app.d0 r0 = r8.f2930b
            boolean r0 = r0.m1149S()
            r1 = 0
            if (r0 == 0) goto L14
            java.lang.String r9 = "FragmentNavigator"
            java.lang.String r10 = "Ignoring navigate() call: FragmentManager has already saved its state"
            android.util.Log.i(r9, r10)
            goto L193
        L14:
            java.lang.String r0 = r9.f2933g0
            if (r0 == 0) goto L19d
            r2 = 0
            char r3 = r0.charAt(r2)
            r4 = 46
            if (r3 != r4) goto L36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.Context r4 = r8.f2929a
            java.lang.String r4 = r4.getPackageName()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L36:
            android.content.Context r3 = r8.f2929a
            androidx.fragment.app.d0 r4 = r8.f2930b
            androidx.fragment.app.z r4 = r4.m1142K()
            java.lang.ClassLoader r3 = r3.getClassLoader()
            androidx.fragment.app.n r0 = r4.mo1196a(r3, r0)
            r0.m1344x0(r10)
            androidx.fragment.app.d0 r10 = r8.f2930b
            androidx.fragment.app.a r3 = new androidx.fragment.app.a
            r3.<init>(r10)
            r10 = -1
            if (r11 == 0) goto L56
            int r4 = r11.f2997d
            goto L57
        L56:
            r4 = -1
        L57:
            if (r11 == 0) goto L5c
            int r5 = r11.f2998e
            goto L5d
        L5c:
            r5 = -1
        L5d:
            if (r11 == 0) goto L62
            int r6 = r11.f2999f
            goto L63
        L62:
            r6 = -1
        L63:
            if (r11 == 0) goto L68
            int r7 = r11.f3000g
            goto L69
        L68:
            r7 = -1
        L69:
            if (r4 != r10) goto L71
            if (r5 != r10) goto L71
            if (r6 != r10) goto L71
            if (r7 == r10) goto L89
        L71:
            if (r4 == r10) goto L74
            goto L75
        L74:
            r4 = 0
        L75:
            if (r5 == r10) goto L78
            goto L79
        L78:
            r5 = 0
        L79:
            if (r6 == r10) goto L7c
            goto L7d
        L7c:
            r6 = 0
        L7d:
            if (r7 == r10) goto L80
            goto L81
        L80:
            r7 = 0
        L81:
            r3.f2234b = r4
            r3.f2235c = r5
            r3.f2236d = r6
            r3.f2237e = r7
        L89:
            int r10 = r8.f2931c
            if (r10 == 0) goto L195
            r4 = 2
            r3.m1081k(r10, r0, r1, r4)
            r3.m1087q(r0)
            int r10 = r9.f2973a0
            java.util.ArrayDeque<java.lang.Integer> r0 = r8.f2932d
            boolean r0 = r0.isEmpty()
            r4 = 1
            if (r11 == 0) goto Lb5
            if (r0 != 0) goto Lb5
            boolean r11 = r11.f2994a
            if (r11 == 0) goto Lb5
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f2932d
            java.lang.Object r11 = r11.peekLast()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r11 != r10) goto Lb5
            r11 = 1
            goto Lb6
        Lb5:
            r11 = 0
        Lb6:
            if (r0 == 0) goto Lb9
            goto Lfa
        Lb9:
            if (r11 == 0) goto Lec
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f2932d
            int r11 = r11.size()
            if (r11 <= r4) goto Lfb
            androidx.fragment.app.d0 r11 = r8.f2930b
            java.util.ArrayDeque<java.lang.Integer> r0 = r8.f2932d
            int r0 = r0.size()
            java.util.ArrayDeque<java.lang.Integer> r5 = r8.f2932d
            java.lang.Object r5 = r5.peekLast()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.String r0 = r8.m1585f(r0, r5)
            r11.m1153W(r0, r4)
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f2932d
            int r11 = r11.size()
            java.lang.String r11 = r8.m1585f(r11, r10)
            r3.m1293d(r11)
            goto Lfb
        Lec:
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f2932d
            int r11 = r11.size()
            int r11 = r11 + r4
            java.lang.String r11 = r8.m1585f(r11, r10)
            r3.m1293d(r11)
        Lfa:
            r2 = 1
        Lfb:
            boolean r11 = r12 instanceof androidx.navigation.fragment.C0510a.b
            if (r11 == 0) goto L182
            androidx.navigation.fragment.a$b r12 = (androidx.navigation.fragment.C0510a.b) r12
            java.util.Objects.requireNonNull(r12)
            java.util.Map r11 = java.util.Collections.unmodifiableMap(r1)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L110:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L182
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r0 = r12.getKey()
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            int[] r5 = androidx.fragment.app.C0408t0.f2373a
            java.util.WeakHashMap<android.view.View, n0.w> r5 = p227n0.C4661t.f18570a
            java.lang.String r0 = p227n0.C4661t.h.m10606k(r0)
            if (r0 == 0) goto L17a
            java.util.ArrayList<java.lang.String> r5 = r3.f2246n
            if (r5 != 0) goto L145
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r3.f2246n = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r3.f2247o = r5
            goto L157
        L145:
            java.util.ArrayList<java.lang.String> r5 = r3.f2247o
            boolean r5 = r5.contains(r12)
            java.lang.String r6 = "' has already been added to the transaction."
            if (r5 != 0) goto L16e
            java.util.ArrayList<java.lang.String> r5 = r3.f2246n
            boolean r5 = r5.contains(r0)
            if (r5 != 0) goto L162
        L157:
            java.util.ArrayList<java.lang.String> r5 = r3.f2246n
            r5.add(r0)
            java.util.ArrayList<java.lang.String> r0 = r3.f2247o
            r0.add(r12)
            goto L110
        L162:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "A shared element with the source name '"
            java.lang.String r10 = android.support.v4.media.C0145d.m257a(r10, r0, r6)
            r9.<init>(r10)
            throw r9
        L16e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "A shared element with the target name '"
            java.lang.String r10 = android.support.v4.media.C0145d.m257a(r10, r12, r6)
            r9.<init>(r10)
            throw r9
        L17a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unique transitionNames are required for all sharedElements"
            r9.<init>(r10)
            throw r9
        L182:
            r3.f2248p = r4
            r3.mo1075e()
            if (r2 == 0) goto L193
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f2932d
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11.add(r10)
            goto L194
        L193:
            r9 = r1
        L194:
            return r9
        L195:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Must use non-zero containerViewId"
            r9.<init>(r10)
            throw r9
        L19d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Fragment class was not set"
            r9.<init>(r10)
            throw r9
    }

    @Override // androidx.navigation.AbstractC0527v
    /* renamed from: c */
    public void mo1581c(android.os.Bundle r5) {
            r4 = this;
            java.lang.String r0 = "androidx-nav-fragment:navigator:backStackIds"
            int[] r5 = r5.getIntArray(r0)
            if (r5 == 0) goto L1f
            java.util.ArrayDeque<java.lang.Integer> r0 = r4.f2932d
            r0.clear()
            int r0 = r5.length
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1f
            r2 = r5[r1]
            java.util.ArrayDeque<java.lang.Integer> r3 = r4.f2932d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            int r1 = r1 + 1
            goto Lf
        L1f:
            return
    }

    @Override // androidx.navigation.AbstractC0527v
    /* renamed from: d */
    public android.os.Bundle mo1582d() {
            r6 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.ArrayDeque<java.lang.Integer> r1 = r6.f2932d
            int r1 = r1.size()
            int[] r1 = new int[r1]
            java.util.ArrayDeque<java.lang.Integer> r2 = r6.f2932d
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L14:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L2a
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r5 = r3 + 1
            int r4 = r4.intValue()
            r1[r3] = r4
            r3 = r5
            goto L14
        L2a:
            java.lang.String r2 = "androidx-nav-fragment:navigator:backStackIds"
            r0.putIntArray(r2, r1)
            return r0
    }

    @Override // androidx.navigation.AbstractC0527v
    /* renamed from: e */
    public boolean mo1579e() {
            r3 = this;
            java.util.ArrayDeque<java.lang.Integer> r0 = r3.f2932d
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            androidx.fragment.app.d0 r0 = r3.f2930b
            boolean r0 = r0.m1149S()
            if (r0 == 0) goto L1a
            java.lang.String r0 = "FragmentNavigator"
            java.lang.String r2 = "Ignoring popBackStack() call: FragmentManager has already saved its state"
            android.util.Log.i(r0, r2)
            return r1
        L1a:
            androidx.fragment.app.d0 r0 = r3.f2930b
            java.util.ArrayDeque<java.lang.Integer> r1 = r3.f2932d
            int r1 = r1.size()
            java.util.ArrayDeque<java.lang.Integer> r2 = r3.f2932d
            java.lang.Object r2 = r2.peekLast()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.String r1 = r3.m1585f(r1, r2)
            r2 = 1
            r0.m1153W(r1, r2)
            java.util.ArrayDeque<java.lang.Integer> r0 = r3.f2932d
            r0.removeLast()
            return r2
    }

    /* renamed from: f */
    public final java.lang.String m1585f(int r2, int r3) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "-"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
