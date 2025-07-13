package androidx.navigation;

/* loaded from: classes.dex */
public class NavController {

    /* renamed from: a */
    public final android.content.Context f2889a;

    /* renamed from: b */
    public android.app.Activity f2890b;

    /* renamed from: c */
    public androidx.navigation.C0523r f2891c;

    /* renamed from: d */
    public androidx.navigation.C0520o f2892d;

    /* renamed from: e */
    public android.os.Bundle f2893e;

    /* renamed from: f */
    public android.os.Parcelable[] f2894f;

    /* renamed from: g */
    public boolean f2895g;

    /* renamed from: h */
    public final java.util.Deque<androidx.navigation.C0514i> f2896h;

    /* renamed from: i */
    public androidx.lifecycle.InterfaceC0471v f2897i;

    /* renamed from: j */
    public androidx.navigation.C0516k f2898j;

    /* renamed from: k */
    public androidx.navigation.C0528w f2899k;

    /* renamed from: l */
    public final java.util.concurrent.CopyOnWriteArrayList<androidx.navigation.NavController.InterfaceC0501b> f2900l;

    /* renamed from: m */
    public final androidx.lifecycle.InterfaceC0470u f2901m;

    /* renamed from: n */
    public final androidx.activity.AbstractC0186b f2902n;

    /* renamed from: o */
    public boolean f2903o;


    /* renamed from: androidx.navigation.NavController$a */
    public class C0500a extends androidx.activity.AbstractC0186b {

        /* renamed from: c */
        public final /* synthetic */ androidx.navigation.NavController f2905c;

        public C0500a(androidx.navigation.NavController r1, boolean r2) {
                r0 = this;
                r0.f2905c = r1
                r0.<init>(r2)
                return
        }

        @Override // androidx.activity.AbstractC0186b
        /* renamed from: a */
        public void mo439a() {
                r1 = this;
                androidx.navigation.NavController r0 = r1.f2905c
                r0.m1569h()
                return
        }
    }

    /* renamed from: androidx.navigation.NavController$b */
    public interface InterfaceC0501b {
        /* renamed from: a */
        void m1574a(androidx.navigation.NavController r1, androidx.navigation.C0518m r2, android.os.Bundle r3);
    }

    public NavController(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.f2896h = r0
            androidx.navigation.w r0 = new androidx.navigation.w
            r0.<init>()
            r2.f2899k = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.f2900l = r0
            androidx.navigation.NavController$1 r0 = new androidx.navigation.NavController$1
            r0.<init>(r2)
            r2.f2901m = r0
            androidx.navigation.NavController$a r0 = new androidx.navigation.NavController$a
            r1 = 0
            r0.<init>(r2, r1)
            r2.f2902n = r0
            r0 = 1
            r2.f2903o = r0
            r2.f2889a = r3
        L2c:
            boolean r0 = r3 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L40
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L39
            android.app.Activity r3 = (android.app.Activity) r3
            r2.f2890b = r3
            goto L40
        L39:
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r3 = r3.getBaseContext()
            goto L2c
        L40:
            androidx.navigation.w r3 = r2.f2899k
            androidx.navigation.p r0 = new androidx.navigation.p
            r0.<init>(r3)
            r3.m1612a(r0)
            androidx.navigation.w r3 = r2.f2899k
            androidx.navigation.b r0 = new androidx.navigation.b
            android.content.Context r1 = r2.f2889a
            r0.<init>(r1)
            r3.m1612a(r0)
            return
    }

    /* renamed from: a */
    public final boolean m1562a() {
            r12 = this;
            androidx.lifecycle.o$c r0 = androidx.lifecycle.AbstractC0458o.c.f2549b0
            androidx.lifecycle.o$c r1 = androidx.lifecycle.AbstractC0458o.c.f2550c0
        L4:
            java.util.Deque<androidx.navigation.i> r2 = r12.f2896h
            boolean r2 = r2.isEmpty()
            r3 = 1
            if (r2 != 0) goto L2e
            java.util.Deque<androidx.navigation.i> r2 = r12.f2896h
            java.lang.Object r2 = r2.peekLast()
            androidx.navigation.i r2 = (androidx.navigation.C0514i) r2
            androidx.navigation.m r2 = r2.f2943Y
            boolean r2 = r2 instanceof androidx.navigation.C0520o
            if (r2 == 0) goto L2e
            java.util.Deque<androidx.navigation.i> r2 = r12.f2896h
            java.lang.Object r2 = r2.peekLast()
            androidx.navigation.i r2 = (androidx.navigation.C0514i) r2
            androidx.navigation.m r2 = r2.f2943Y
            int r2 = r2.f2973a0
            boolean r2 = r12.m1571j(r2, r3)
            if (r2 == 0) goto L2e
            goto L4
        L2e:
            java.util.Deque<androidx.navigation.i> r2 = r12.f2896h
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lf4
            java.util.Deque<androidx.navigation.i> r2 = r12.f2896h
            java.lang.Object r2 = r2.peekLast()
            androidx.navigation.i r2 = (androidx.navigation.C0514i) r2
            androidx.navigation.m r2 = r2.f2943Y
            r4 = 0
            boolean r5 = r2 instanceof androidx.navigation.InterfaceC0504c
            if (r5 == 0) goto L62
            java.util.Deque<androidx.navigation.i> r5 = r12.f2896h
            java.util.Iterator r5 = r5.descendingIterator()
        L4b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L62
            java.lang.Object r6 = r5.next()
            androidx.navigation.i r6 = (androidx.navigation.C0514i) r6
            androidx.navigation.m r6 = r6.f2943Y
            boolean r7 = r6 instanceof androidx.navigation.C0520o
            if (r7 != 0) goto L4b
            boolean r7 = r6 instanceof androidx.navigation.InterfaceC0504c
            if (r7 != 0) goto L4b
            r4 = r6
        L62:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Deque<androidx.navigation.i> r6 = r12.f2896h
            java.util.Iterator r6 = r6.descendingIterator()
        L6d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lad
            java.lang.Object r7 = r6.next()
            androidx.navigation.i r7 = (androidx.navigation.C0514i) r7
            androidx.lifecycle.o$c r8 = r7.f2949e0
            androidx.navigation.m r9 = r7.f2943Y
            if (r2 == 0) goto L8d
            int r10 = r9.f2973a0
            int r11 = r2.f2973a0
            if (r10 != r11) goto L8d
            if (r8 == r1) goto L8a
            r5.put(r7, r1)
        L8a:
            androidx.navigation.o r2 = r2.f2972Z
            goto L6d
        L8d:
            if (r4 == 0) goto La5
            int r9 = r9.f2973a0
            int r10 = r4.f2973a0
            if (r9 != r10) goto La5
            if (r8 != r1) goto L9d
            r7.f2949e0 = r0
            r7.m1586a()
            goto La2
        L9d:
            if (r8 == r0) goto La2
            r5.put(r7, r0)
        La2:
            androidx.navigation.o r4 = r4.f2972Z
            goto L6d
        La5:
            androidx.lifecycle.o$c r8 = androidx.lifecycle.AbstractC0458o.c.f2548a0
            r7.f2949e0 = r8
            r7.m1586a()
            goto L6d
        Lad:
            java.util.Deque<androidx.navigation.i> r0 = r12.f2896h
            java.util.Iterator r0 = r0.iterator()
        Lb3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld1
            java.lang.Object r1 = r0.next()
            androidx.navigation.i r1 = (androidx.navigation.C0514i) r1
            java.lang.Object r2 = r5.get(r1)
            androidx.lifecycle.o$c r2 = (androidx.lifecycle.AbstractC0458o.c) r2
            if (r2 == 0) goto Lcd
            r1.f2949e0 = r2
            r1.m1586a()
            goto Lb3
        Lcd:
            r1.m1586a()
            goto Lb3
        Ld1:
            java.util.Deque<androidx.navigation.i> r0 = r12.f2896h
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.i r0 = (androidx.navigation.C0514i) r0
            java.util.concurrent.CopyOnWriteArrayList<androidx.navigation.NavController$b> r1 = r12.f2900l
            java.util.Iterator r1 = r1.iterator()
        Ldf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lf3
            java.lang.Object r2 = r1.next()
            androidx.navigation.NavController$b r2 = (androidx.navigation.NavController.InterfaceC0501b) r2
            androidx.navigation.m r4 = r0.f2943Y
            android.os.Bundle r5 = r0.f2944Z
            r2.m1574a(r12, r4, r5)
            goto Ldf
        Lf3:
            return r3
        Lf4:
            r0 = 0
            return r0
    }

    /* renamed from: b */
    public androidx.navigation.C0518m m1563b(int r3) {
            r2 = this;
            androidx.navigation.o r0 = r2.f2892d
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            int r1 = r0.f2973a0
            if (r1 != r3) goto Lb
            return r0
        Lb:
            java.util.Deque<androidx.navigation.i> r0 = r2.f2896h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L16
            androidx.navigation.o r0 = r2.f2892d
            goto L20
        L16:
            java.util.Deque<androidx.navigation.i> r0 = r2.f2896h
            java.lang.Object r0 = r0.getLast()
            androidx.navigation.i r0 = (androidx.navigation.C0514i) r0
            androidx.navigation.m r0 = r0.f2943Y
        L20:
            boolean r1 = r0 instanceof androidx.navigation.C0520o
            if (r1 == 0) goto L27
            androidx.navigation.o r0 = (androidx.navigation.C0520o) r0
            goto L29
        L27:
            androidx.navigation.o r0 = r0.f2972Z
        L29:
            r1 = 1
            androidx.navigation.m r3 = r0.m1598p(r3, r1)
            return r3
    }

    /* renamed from: c */
    public androidx.navigation.C0518m m1564c() {
            r2 = this;
            java.util.Deque<androidx.navigation.i> r0 = r2.f2896h
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto Lb
            r0 = r1
            goto L13
        Lb:
            java.util.Deque<androidx.navigation.i> r0 = r2.f2896h
            java.lang.Object r0 = r0.getLast()
            androidx.navigation.i r0 = (androidx.navigation.C0514i) r0
        L13:
            if (r0 == 0) goto L17
            androidx.navigation.m r1 = r0.f2943Y
        L17:
            return r1
    }

    /* renamed from: d */
    public androidx.navigation.C0520o m1565d() {
            r2 = this;
            androidx.navigation.o r0 = r2.f2892d
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must call setGraph() before calling getGraph()"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: e */
    public boolean m1566e(android.content.Intent r19) {
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            android.os.Bundle r3 = r19.getExtras()
            r4 = 0
            if (r3 == 0) goto L16
            java.lang.String r5 = "android-support-nav:controller:deepLinkIds"
            int[] r5 = r3.getIntArray(r5)
            goto L17
        L16:
            r5 = r4
        L17:
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            if (r3 == 0) goto L25
            java.lang.String r7 = "android-support-nav:controller:deepLinkExtras"
            android.os.Bundle r3 = r3.getBundle(r7)
            goto L26
        L25:
            r3 = r4
        L26:
            if (r3 == 0) goto L2b
            r6.putAll(r3)
        L2b:
            if (r5 == 0) goto L30
            int r3 = r5.length
            if (r3 != 0) goto L88
        L30:
            android.net.Uri r3 = r19.getData()
            if (r3 == 0) goto L88
            androidx.navigation.o r3 = r1.f2892d
            androidx.fragment.app.l0 r7 = new androidx.fragment.app.l0
            r7.<init>(r0)
            androidx.navigation.m$a r3 = r3.mo1594i(r7)
            if (r3 == 0) goto L88
            androidx.navigation.m r7 = r3.f2979Y
            java.util.Objects.requireNonNull(r7)
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>()
            r5 = r7
        L4e:
            androidx.navigation.o r9 = r5.f2972Z
            if (r9 == 0) goto L58
            int r10 = r9.f2985h0
            int r11 = r5.f2973a0
            if (r10 == r11) goto L5b
        L58:
            r8.addFirst(r5)
        L5b:
            if (r9 != 0) goto L86
            int r5 = r8.size()
            int[] r5 = new int[r5]
            java.util.Iterator r8 = r8.iterator()
            r9 = 0
        L68:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L7c
            java.lang.Object r10 = r8.next()
            androidx.navigation.m r10 = (androidx.navigation.C0518m) r10
            int r11 = r9 + 1
            int r10 = r10.f2973a0
            r5[r9] = r10
            r9 = r11
            goto L68
        L7c:
            android.os.Bundle r3 = r3.f2980Z
            android.os.Bundle r3 = r7.m1592a(r3)
            r6.putAll(r3)
            goto L88
        L86:
            r5 = r9
            goto L4e
        L88:
            if (r5 == 0) goto L242
            int r3 = r5.length
            if (r3 != 0) goto L8f
            goto L242
        L8f:
            androidx.navigation.o r3 = r1.f2892d
            r7 = 0
        L92:
            int r8 = r5.length
            if (r7 >= r8) goto Lce
            r8 = r5[r7]
            if (r7 != 0) goto La2
            androidx.navigation.o r9 = r1.f2892d
            int r10 = r9.f2973a0
            if (r10 != r8) goto La0
            goto La6
        La0:
            r9 = r4
            goto La6
        La2:
            androidx.navigation.m r9 = r3.m1597n(r8)
        La6:
            if (r9 != 0) goto Laf
            android.content.Context r3 = r1.f2889a
            java.lang.String r3 = androidx.navigation.C0518m.m1591h(r3, r8)
            goto Lcf
        Laf:
            int r8 = r5.length
            int r8 = r8 + (-1)
            if (r7 == r8) goto Lcb
            androidx.navigation.o r9 = (androidx.navigation.C0520o) r9
        Lb6:
            int r3 = r9.f2985h0
            androidx.navigation.m r3 = r9.m1597n(r3)
            boolean r3 = r3 instanceof androidx.navigation.C0520o
            if (r3 == 0) goto Lca
            int r3 = r9.f2985h0
            androidx.navigation.m r3 = r9.m1597n(r3)
            r9 = r3
            androidx.navigation.o r9 = (androidx.navigation.C0520o) r9
            goto Lb6
        Lca:
            r3 = r9
        Lcb:
            int r7 = r7 + 1
            goto L92
        Lce:
            r3 = r4
        Lcf:
            if (r3 == 0) goto Lf0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Could not find destination "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = " in the navigation graph, ignoring the deep link from "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r3 = "NavController"
            android.util.Log.i(r3, r0)
            return r2
        Lf0:
            java.lang.String r3 = "android-support-nav:controller:deepLinkIntent"
            r6.putParcelable(r3, r0)
            int r3 = r19.getFlags()
            r7 = 268435456(0x10000000, float:2.524355E-29)
            r7 = r7 & r3
            r8 = 1
            if (r7 == 0) goto L17e
            r9 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 & r9
            if (r3 != 0) goto L17e
            r0.addFlags(r9)
            android.content.Context r3 = r1.f2889a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            android.content.ComponentName r6 = r19.getComponent()
            if (r6 != 0) goto L11d
            android.content.pm.PackageManager r6 = r3.getPackageManager()
            android.content.ComponentName r6 = r0.resolveActivity(r6)
        L11d:
            if (r6 == 0) goto L13f
            int r7 = r5.size()
        L123:
            android.content.Intent r6 = p030c0.C0821h.m2472b(r3, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L131
            if (r6 == 0) goto L13f
            r5.add(r7, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L131
            android.content.ComponentName r6 = r6.getComponent()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L131
            goto L123
        L131:
            r0 = move-exception
            java.lang.String r2 = "TaskStackBuilder"
            java.lang.String r3 = "Bad ComponentName while traversing activity parent metadata"
            android.util.Log.e(r2, r3)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r0)
            throw r2
        L13f:
            r5.add(r0)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L176
            int r0 = r5.size()
            android.content.Intent[] r0 = new android.content.Intent[r0]
            java.lang.Object[] r0 = r5.toArray(r0)
            android.content.Intent[] r0 = (android.content.Intent[]) r0
            android.content.Intent r5 = new android.content.Intent
            r6 = r0[r2]
            r5.<init>(r6)
            r6 = 268484608(0x1000c000, float:2.539146E-29)
            android.content.Intent r5 = r5.addFlags(r6)
            r0[r2] = r5
            java.lang.Object r5 = p046d0.C1259a.f6733a
            p046d0.C1259a.a.m3707a(r3, r0, r4)
            android.app.Activity r0 = r1.f2890b
            if (r0 == 0) goto L175
            r0.finish()
            android.app.Activity r0 = r1.f2890b
            r0.overridePendingTransition(r2, r2)
        L175:
            return r8
        L176:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "No intents added to TaskStackBuilder; cannot startActivities"
            r0.<init>(r2)
            throw r0
        L17e:
            java.lang.String r0 = "Deep Linking failed: destination "
            if (r7 == 0) goto L1d1
            java.util.Deque<androidx.navigation.i> r3 = r1.f2896h
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L191
            androidx.navigation.o r3 = r1.f2892d
            int r3 = r3.f2973a0
            r1.m1571j(r3, r8)
        L191:
            int r3 = r5.length
            if (r2 >= r3) goto L1d0
            int r3 = r2 + 1
            r2 = r5[r2]
            androidx.navigation.m r7 = r1.m1563b(r2)
            if (r7 == 0) goto L1b3
            r12 = 0
            r10 = 0
            r16 = -1
            r13 = 0
            r14 = 0
            androidx.navigation.s r2 = new androidx.navigation.s
            r9 = r2
            r11 = r16
            r15 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r1.m1568g(r7, r6, r2, r4)
            r2 = r3
            goto L191
        L1b3:
            android.content.Context r3 = r1.f2889a
            java.lang.String r2 = androidx.navigation.C0518m.m1591h(r3, r2)
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = " cannot be found from the current destination "
            java.lang.StringBuilder r0 = androidx.activity.result.C0196d.m449a(r0, r2, r4)
            androidx.navigation.m r2 = r18.m1564c()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L1d0:
            return r8
        L1d1:
            androidx.navigation.o r3 = r1.f2892d
        L1d3:
            int r7 = r5.length
            if (r2 >= r7) goto L23f
            r7 = r5[r2]
            if (r2 != 0) goto L1dd
            androidx.navigation.o r9 = r1.f2892d
            goto L1e1
        L1dd:
            androidx.navigation.m r9 = r3.m1597n(r7)
        L1e1:
            if (r9 == 0) goto L21c
            int r7 = r5.length
            int r7 = r7 - r8
            if (r2 == r7) goto L1ff
            androidx.navigation.o r9 = (androidx.navigation.C0520o) r9
        L1e9:
            int r3 = r9.f2985h0
            androidx.navigation.m r3 = r9.m1597n(r3)
            boolean r3 = r3 instanceof androidx.navigation.C0520o
            if (r3 == 0) goto L1fd
            int r3 = r9.f2985h0
            androidx.navigation.m r3 = r9.m1597n(r3)
            r9 = r3
            androidx.navigation.o r9 = (androidx.navigation.C0520o) r9
            goto L1e9
        L1fd:
            r3 = r9
            goto L219
        L1ff:
            android.os.Bundle r7 = r9.m1592a(r6)
            r11 = 0
            r17 = -1
            androidx.navigation.o r10 = r1.f2892d
            int r12 = r10.f2973a0
            r13 = 1
            r14 = 0
            r15 = 0
            androidx.navigation.s r10 = new androidx.navigation.s
            r19 = r10
            r16 = r17
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r1.m1568g(r9, r7, r10, r4)
        L219:
            int r2 = r2 + 1
            goto L1d3
        L21c:
            android.content.Context r2 = r1.f2889a
            java.lang.String r2 = androidx.navigation.C0518m.m1591h(r2, r7)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " cannot be found in graph "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = r5.toString()
            r4.<init>(r0)
            throw r4
        L23f:
            r1.f2895g = r8
            return r8
        L242:
            return r2
    }

    /* renamed from: f */
    public void m1567f(int r8, android.os.Bundle r9) {
            r7 = this;
            java.util.Deque<androidx.navigation.i> r0 = r7.f2896h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            androidx.navigation.o r0 = r7.f2892d
            goto L15
        Lb:
            java.util.Deque<androidx.navigation.i> r0 = r7.f2896h
            java.lang.Object r0 = r0.getLast()
            androidx.navigation.i r0 = (androidx.navigation.C0514i) r0
            androidx.navigation.m r0 = r0.f2943Y
        L15:
            if (r0 == 0) goto La9
            androidx.navigation.d r1 = r0.m1593e(r8)
            r2 = 0
            if (r1 == 0) goto L2f
            androidx.navigation.s r3 = r1.f2912b
            int r4 = r1.f2911a
            android.os.Bundle r5 = r1.f2913c
            if (r5 == 0) goto L31
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r6.putAll(r5)
            goto L32
        L2f:
            r4 = r8
            r3 = r2
        L31:
            r6 = r2
        L32:
            if (r9 == 0) goto L3e
            if (r6 != 0) goto L3b
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
        L3b:
            r6.putAll(r9)
        L3e:
            if (r4 != 0) goto L4d
            if (r3 == 0) goto L4d
            int r9 = r3.f2995b
            r5 = -1
            if (r9 == r5) goto L4d
            boolean r8 = r3.f2996c
            r7.m1570i(r9, r8)
            goto La0
        L4d:
            if (r4 == 0) goto La1
            androidx.navigation.m r9 = r7.m1563b(r4)
            if (r9 != 0) goto L9d
            android.content.Context r9 = r7.f2889a
            java.lang.String r9 = androidx.navigation.C0518m.m1591h(r9, r4)
            java.lang.String r2 = " cannot be found from the current destination "
            if (r1 == 0) goto L80
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Navigation destination "
            java.lang.String r4 = " referenced from action "
            java.lang.StringBuilder r9 = androidx.activity.result.C0196d.m449a(r3, r9, r4)
            android.content.Context r3 = r7.f2889a
            java.lang.String r8 = androidx.navigation.C0518m.m1591h(r3, r8)
            r9.append(r8)
            r9.append(r2)
            r9.append(r0)
            java.lang.String r8 = r9.toString()
            r1.<init>(r8)
            throw r1
        L80:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Navigation action/destination "
            r1.append(r3)
            r1.append(r9)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            r8.<init>(r9)
            throw r8
        L9d:
            r7.m1568g(r9, r6, r3, r2)
        La0:
            return
        La1:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo"
            r8.<init>(r9)
            throw r8
        La9:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "no current navigation node"
            r8.<init>(r9)
            throw r8
    }

    /* renamed from: g */
    public final void m1568g(androidx.navigation.C0518m r12, android.os.Bundle r13, androidx.navigation.C0524s r14, androidx.navigation.AbstractC0527v.a r15) {
            r11 = this;
            r0 = 0
            if (r14 == 0) goto Lf
            int r1 = r14.f2995b
            r2 = -1
            if (r1 == r2) goto Lf
            boolean r2 = r14.f2996c
            boolean r1 = r11.m1571j(r1, r2)
            goto L10
        Lf:
            r1 = 0
        L10:
            androidx.navigation.w r2 = r11.f2899k
            java.lang.String r3 = r12.f2971Y
            androidx.navigation.v r2 = r2.m1613c(r3)
            android.os.Bundle r13 = r12.m1592a(r13)
            androidx.navigation.m r15 = r2.mo1578b(r12, r13, r14, r15)
            r2 = 1
            if (r15 == 0) goto L152
            boolean r14 = r15 instanceof androidx.navigation.InterfaceC0504c
            if (r14 != 0) goto L50
        L27:
            java.util.Deque<androidx.navigation.i> r14 = r11.f2896h
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L50
            java.util.Deque<androidx.navigation.i> r14 = r11.f2896h
            java.lang.Object r14 = r14.peekLast()
            androidx.navigation.i r14 = (androidx.navigation.C0514i) r14
            androidx.navigation.m r14 = r14.f2943Y
            boolean r14 = r14 instanceof androidx.navigation.InterfaceC0504c
            if (r14 == 0) goto L50
            java.util.Deque<androidx.navigation.i> r14 = r11.f2896h
            java.lang.Object r14 = r14.peekLast()
            androidx.navigation.i r14 = (androidx.navigation.C0514i) r14
            androidx.navigation.m r14 = r14.f2943Y
            int r14 = r14.f2973a0
            boolean r14 = r11.m1571j(r14, r2)
            if (r14 == 0) goto L50
            goto L27
        L50:
            java.util.ArrayDeque r14 = new java.util.ArrayDeque
            r14.<init>()
            boolean r3 = r12 instanceof androidx.navigation.C0520o
            if (r3 == 0) goto L8f
            r3 = r15
        L5a:
            androidx.navigation.o r9 = r3.f2972Z
            if (r9 == 0) goto L88
            androidx.navigation.i r10 = new androidx.navigation.i
            android.content.Context r4 = r11.f2889a
            androidx.lifecycle.v r7 = r11.f2897i
            androidx.navigation.k r8 = r11.f2898j
            r3 = r10
            r5 = r9
            r6 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r14.addFirst(r10)
            java.util.Deque<androidx.navigation.i> r3 = r11.f2896h
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L88
            java.util.Deque<androidx.navigation.i> r3 = r11.f2896h
            java.lang.Object r3 = r3.getLast()
            androidx.navigation.i r3 = (androidx.navigation.C0514i) r3
            androidx.navigation.m r3 = r3.f2943Y
            if (r3 != r9) goto L88
            int r3 = r9.f2973a0
            r11.m1571j(r3, r2)
        L88:
            if (r9 == 0) goto L8f
            if (r9 != r12) goto L8d
            goto L8f
        L8d:
            r3 = r9
            goto L5a
        L8f:
            boolean r12 = r14.isEmpty()
            if (r12 == 0) goto L97
            r12 = r15
            goto L9f
        L97:
            java.lang.Object r12 = r14.getFirst()
            androidx.navigation.i r12 = (androidx.navigation.C0514i) r12
            androidx.navigation.m r12 = r12.f2943Y
        L9f:
            if (r12 == 0) goto Lbf
            int r3 = r12.f2973a0
            androidx.navigation.m r3 = r11.m1563b(r3)
            if (r3 != 0) goto Lbf
            androidx.navigation.o r12 = r12.f2972Z
            if (r12 == 0) goto L9f
            androidx.navigation.i r9 = new androidx.navigation.i
            android.content.Context r4 = r11.f2889a
            androidx.lifecycle.v r7 = r11.f2897i
            androidx.navigation.k r8 = r11.f2898j
            r3 = r9
            r5 = r12
            r6 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r14.addFirst(r9)
            goto L9f
        Lbf:
            boolean r12 = r14.isEmpty()
            if (r12 == 0) goto Lc7
            r12 = r15
            goto Lcf
        Lc7:
            java.lang.Object r12 = r14.getLast()
            androidx.navigation.i r12 = (androidx.navigation.C0514i) r12
            androidx.navigation.m r12 = r12.f2943Y
        Lcf:
            java.util.Deque<androidx.navigation.i> r3 = r11.f2896h
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L10c
            java.util.Deque<androidx.navigation.i> r3 = r11.f2896h
            java.lang.Object r3 = r3.getLast()
            androidx.navigation.i r3 = (androidx.navigation.C0514i) r3
            androidx.navigation.m r3 = r3.f2943Y
            boolean r3 = r3 instanceof androidx.navigation.C0520o
            if (r3 == 0) goto L10c
            java.util.Deque<androidx.navigation.i> r3 = r11.f2896h
            java.lang.Object r3 = r3.getLast()
            androidx.navigation.i r3 = (androidx.navigation.C0514i) r3
            androidx.navigation.m r3 = r3.f2943Y
            androidx.navigation.o r3 = (androidx.navigation.C0520o) r3
            int r4 = r12.f2973a0
            androidx.navigation.m r3 = r3.m1598p(r4, r0)
            if (r3 != 0) goto L10c
            java.util.Deque<androidx.navigation.i> r3 = r11.f2896h
            java.lang.Object r3 = r3.getLast()
            androidx.navigation.i r3 = (androidx.navigation.C0514i) r3
            androidx.navigation.m r3 = r3.f2943Y
            int r3 = r3.f2973a0
            boolean r3 = r11.m1571j(r3, r2)
            if (r3 == 0) goto L10c
            goto Lcf
        L10c:
            java.util.Deque<androidx.navigation.i> r12 = r11.f2896h
            r12.addAll(r14)
            java.util.Deque<androidx.navigation.i> r12 = r11.f2896h
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L127
            java.util.Deque<androidx.navigation.i> r12 = r11.f2896h
            java.lang.Object r12 = r12.getFirst()
            androidx.navigation.i r12 = (androidx.navigation.C0514i) r12
            androidx.navigation.m r12 = r12.f2943Y
            androidx.navigation.o r14 = r11.f2892d
            if (r12 == r14) goto L13b
        L127:
            androidx.navigation.i r12 = new androidx.navigation.i
            android.content.Context r4 = r11.f2889a
            androidx.navigation.o r5 = r11.f2892d
            androidx.lifecycle.v r7 = r11.f2897i
            androidx.navigation.k r8 = r11.f2898j
            r3 = r12
            r6 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.Deque<androidx.navigation.i> r14 = r11.f2896h
            r14.addFirst(r12)
        L13b:
            androidx.navigation.i r12 = new androidx.navigation.i
            android.content.Context r4 = r11.f2889a
            android.os.Bundle r6 = r15.m1592a(r13)
            androidx.lifecycle.v r7 = r11.f2897i
            androidx.navigation.k r8 = r11.f2898j
            r3 = r12
            r5 = r15
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.Deque<androidx.navigation.i> r13 = r11.f2896h
            r13.add(r12)
            goto L165
        L152:
            if (r14 == 0) goto L165
            boolean r12 = r14.f2994a
            if (r12 == 0) goto L165
            java.util.Deque<androidx.navigation.i> r12 = r11.f2896h
            java.lang.Object r12 = r12.peekLast()
            androidx.navigation.i r12 = (androidx.navigation.C0514i) r12
            if (r12 == 0) goto L164
            r12.f2944Z = r13
        L164:
            r0 = 1
        L165:
            r11.m1573l()
            if (r1 != 0) goto L16e
            if (r15 != 0) goto L16e
            if (r0 == 0) goto L171
        L16e:
            r11.m1562a()
        L171:
            return
    }

    /* renamed from: h */
    public boolean m1569h() {
            r2 = this;
            java.util.Deque<androidx.navigation.i> r0 = r2.f2896h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            androidx.navigation.m r0 = r2.m1564c()
            int r0 = r0.f2973a0
            r1 = 1
            boolean r0 = r2.m1570i(r0, r1)
            return r0
    }

    /* renamed from: i */
    public boolean m1570i(int r1, boolean r2) {
            r0 = this;
            boolean r1 = r0.m1571j(r1, r2)
            if (r1 == 0) goto Le
            boolean r1 = r0.m1562a()
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    /* renamed from: j */
    public boolean m1571j(int r8, boolean r9) {
            r7 = this;
            java.util.Deque<androidx.navigation.i> r0 = r7.f2896h
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Deque<androidx.navigation.i> r2 = r7.f2896h
            java.util.Iterator r2 = r2.descendingIterator()
        L15:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r2.next()
            androidx.navigation.i r3 = (androidx.navigation.C0514i) r3
            androidx.navigation.m r3 = r3.f2943Y
            androidx.navigation.w r5 = r7.f2899k
            java.lang.String r6 = r3.f2971Y
            androidx.navigation.v r5 = r5.m1613c(r6)
            if (r9 != 0) goto L32
            int r6 = r3.f2973a0
            if (r6 == r8) goto L35
        L32:
            r0.add(r5)
        L35:
            int r3 = r3.f2973a0
            if (r3 != r8) goto L15
            r9 = 1
            goto L3c
        L3b:
            r9 = 0
        L3c:
            if (r9 != 0) goto L60
            android.content.Context r9 = r7.f2889a
            java.lang.String r8 = androidx.navigation.C0518m.m1591h(r9, r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Ignoring popBackStack to destination "
            r9.append(r0)
            r9.append(r8)
            java.lang.String r8 = " as it was not found on the current back stack"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "NavController"
            android.util.Log.i(r9, r8)
            return r1
        L60:
            java.util.Iterator r8 = r0.iterator()
            r9 = 0
        L65:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lac
            java.lang.Object r0 = r8.next()
            androidx.navigation.v r0 = (androidx.navigation.AbstractC0527v) r0
            boolean r0 = r0.mo1579e()
            if (r0 == 0) goto Lac
            java.util.Deque<androidx.navigation.i> r9 = r7.f2896h
            java.lang.Object r9 = r9.removeLast()
            androidx.navigation.i r9 = (androidx.navigation.C0514i) r9
            androidx.lifecycle.w r0 = r9.f2945a0
            androidx.lifecycle.o$c r0 = r0.f2564c
            androidx.lifecycle.o$c r2 = androidx.lifecycle.AbstractC0458o.c.f2548a0
            int r0 = r0.compareTo(r2)
            if (r0 < 0) goto L8d
            r0 = 1
            goto L8e
        L8d:
            r0 = 0
        L8e:
            if (r0 == 0) goto L97
            androidx.lifecycle.o$c r0 = androidx.lifecycle.AbstractC0458o.c.f2546Y
            r9.f2949e0 = r0
            r9.m1586a()
        L97:
            androidx.navigation.k r0 = r7.f2898j
            if (r0 == 0) goto Laa
            java.util.UUID r9 = r9.f2947c0
            java.util.HashMap<java.util.UUID, androidx.lifecycle.s0> r0 = r0.f2957c
            java.lang.Object r9 = r0.remove(r9)
            androidx.lifecycle.s0 r9 = (androidx.lifecycle.C0467s0) r9
            if (r9 == 0) goto Laa
            r9.m1458a()
        Laa:
            r9 = 1
            goto L65
        Lac:
            r7.m1573l()
            return r9
    }

    /* renamed from: k */
    public void m1572k(int r17, android.os.Bundle r18) {
            r16 = this;
            r0 = r16
            androidx.navigation.r r1 = r0.f2891c
            if (r1 != 0) goto L11
            androidx.navigation.r r1 = new androidx.navigation.r
            android.content.Context r2 = r0.f2889a
            androidx.navigation.w r3 = r0.f2899k
            r1.<init>(r2, r3)
            r0.f2891c = r1
        L11:
            androidx.navigation.r r1 = r0.f2891c
            r2 = r17
            androidx.navigation.o r1 = r1.m1601c(r2)
            androidx.navigation.o r2 = r0.f2892d
            r3 = 1
            if (r2 == 0) goto L23
            int r2 = r2.f2973a0
            r0.m1571j(r2, r3)
        L23:
            r0.f2892d = r1
            android.os.Bundle r1 = r0.f2893e
            if (r1 == 0) goto L53
            java.lang.String r2 = "android-support-nav:controller:navigatorState:names"
            java.util.ArrayList r1 = r1.getStringArrayList(r2)
            if (r1 == 0) goto L53
            java.util.Iterator r1 = r1.iterator()
        L35:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L53
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            androidx.navigation.w r4 = r0.f2899k
            androidx.navigation.v r4 = r4.m1613c(r2)
            android.os.Bundle r5 = r0.f2893e
            android.os.Bundle r2 = r5.getBundle(r2)
            if (r2 == 0) goto L35
            r4.mo1581c(r2)
            goto L35
        L53:
            android.os.Parcelable[] r1 = r0.f2894f
            r2 = 0
            if (r1 == 0) goto Lb3
            int r4 = r1.length
            r5 = 0
        L5a:
            if (r5 >= r4) goto Lae
            r6 = r1[r5]
            androidx.navigation.j r6 = (androidx.navigation.C0515j) r6
            int r7 = r6.f2953Z
            androidx.navigation.m r10 = r0.m1563b(r7)
            if (r10 == 0) goto L8d
            android.os.Bundle r11 = r6.f2954a0
            if (r11 == 0) goto L75
            android.content.Context r7 = r0.f2889a
            java.lang.ClassLoader r7 = r7.getClassLoader()
            r11.setClassLoader(r7)
        L75:
            androidx.navigation.i r7 = new androidx.navigation.i
            android.content.Context r9 = r0.f2889a
            androidx.lifecycle.v r12 = r0.f2897i
            androidx.navigation.k r13 = r0.f2898j
            java.util.UUID r14 = r6.f2952Y
            android.os.Bundle r15 = r6.f2955b0
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            java.util.Deque<androidx.navigation.i> r6 = r0.f2896h
            r6.add(r7)
            int r5 = r5 + 1
            goto L5a
        L8d:
            android.content.Context r1 = r0.f2889a
            int r2 = r6.f2953Z
            java.lang.String r1 = androidx.navigation.C0518m.m1591h(r1, r2)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Restoring the Navigation back stack failed: destination "
            java.lang.String r4 = " cannot be found from the current destination "
            java.lang.StringBuilder r1 = androidx.activity.result.C0196d.m449a(r3, r1, r4)
            androidx.navigation.m r3 = r16.m1564c()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        Lae:
            r16.m1573l()
            r0.f2894f = r2
        Lb3:
            androidx.navigation.o r1 = r0.f2892d
            if (r1 == 0) goto Ldd
            java.util.Deque<androidx.navigation.i> r1 = r0.f2896h
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Ldd
            boolean r1 = r0.f2895g
            if (r1 != 0) goto Ld2
            android.app.Activity r1 = r0.f2890b
            if (r1 == 0) goto Ld2
            android.content.Intent r1 = r1.getIntent()
            boolean r1 = r0.m1566e(r1)
            if (r1 == 0) goto Ld2
            goto Ld3
        Ld2:
            r3 = 0
        Ld3:
            if (r3 != 0) goto Le0
            androidx.navigation.o r1 = r0.f2892d
            r3 = r18
            r0.m1568g(r1, r3, r2, r2)
            goto Le0
        Ldd:
            r16.m1562a()
        Le0:
            return
    }

    /* renamed from: l */
    public final void m1573l() {
            r6 = this;
            androidx.activity.b r0 = r6.f2902n
            boolean r1 = r6.f2903o
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L27
            java.util.Deque<androidx.navigation.i> r1 = r6.f2896h
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        Lf:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L24
            java.lang.Object r5 = r1.next()
            androidx.navigation.i r5 = (androidx.navigation.C0514i) r5
            androidx.navigation.m r5 = r5.f2943Y
            boolean r5 = r5 instanceof androidx.navigation.C0520o
            if (r5 != 0) goto Lf
            int r4 = r4 + 1
            goto Lf
        L24:
            if (r4 <= r3) goto L27
            r2 = 1
        L27:
            r0.f616a = r2
            return
    }
}
