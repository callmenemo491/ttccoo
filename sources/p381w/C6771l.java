package p381w;

/* renamed from: w.l */
/* loaded from: classes.dex */
public class C6771l {

    /* renamed from: a */
    public static boolean[] f26241a;

    static {
            r0 = 3
            boolean[] r0 = new boolean[r0]
            p381w.C6771l.f26241a = r0
            return
    }

    /* renamed from: a */
    public static void m13745a(p381w.C6766g r7, p365v.C6477d r8, p381w.C6765f r9) {
            w.f$a r0 = p381w.C6765f.a.f26192b0
            r1 = -1
            r9.f26155j = r1
            r9.f26157k = r1
            w.f$a[] r1 = r7.f26127Q
            r2 = 0
            r1 = r1[r2]
            w.f$a r3 = p381w.C6765f.a.f26190Z
            r4 = 2
            if (r1 == r3) goto L4f
            w.f$a[] r1 = r9.f26127Q
            r1 = r1[r2]
            if (r1 != r0) goto L4f
            w.d r1 = r9.f26114F
            int r1 = r1.f26092g
            int r2 = r7.m13721u()
            w.d r5 = r9.f26118H
            int r5 = r5.f26092g
            int r2 = r2 - r5
            w.d r5 = r9.f26114F
            v.h r6 = r8.m13134l(r5)
            r5.f26094i = r6
            w.d r5 = r9.f26118H
            v.h r6 = r8.m13134l(r5)
            r5.f26094i = r6
            w.d r5 = r9.f26114F
            v.h r5 = r5.f26094i
            r8.m13127e(r5, r1)
            w.d r5 = r9.f26118H
            v.h r5 = r5.f26094i
            r8.m13127e(r5, r2)
            r9.f26155j = r4
            r9.f26133W = r1
            int r2 = r2 - r1
            r9.f26129S = r2
            int r1 = r9.f26144d0
            if (r2 >= r1) goto L4f
            r9.f26129S = r1
        L4f:
            w.f$a[] r1 = r7.f26127Q
            r2 = 1
            r1 = r1[r2]
            if (r1 == r3) goto Lb0
            w.f$a[] r1 = r9.f26127Q
            r1 = r1[r2]
            if (r1 != r0) goto Lb0
            w.d r0 = r9.f26116G
            int r0 = r0.f26092g
            int r7 = r7.m13715o()
            w.d r1 = r9.f26119I
            int r1 = r1.f26092g
            int r7 = r7 - r1
            w.d r1 = r9.f26116G
            v.h r2 = r8.m13134l(r1)
            r1.f26094i = r2
            w.d r1 = r9.f26119I
            v.h r2 = r8.m13134l(r1)
            r1.f26094i = r2
            w.d r1 = r9.f26116G
            v.h r1 = r1.f26094i
            r8.m13127e(r1, r0)
            w.d r1 = r9.f26119I
            v.h r1 = r1.f26094i
            r8.m13127e(r1, r7)
            int r1 = r9.f26142c0
            if (r1 > 0) goto L91
            int r1 = r9.f26156j0
            r2 = 8
            if (r1 != r2) goto La3
        L91:
            w.d r1 = r9.f26120J
            v.h r2 = r8.m13134l(r1)
            r1.f26094i = r2
            w.d r1 = r9.f26120J
            v.h r1 = r1.f26094i
            int r2 = r9.f26142c0
            int r2 = r2 + r0
            r8.m13127e(r1, r2)
        La3:
            r9.f26157k = r4
            r9.f26134X = r0
            int r7 = r7 - r0
            r9.f26130T = r7
            int r8 = r9.f26146e0
            if (r7 >= r8) goto Lb0
            r9.f26130T = r8
        Lb0:
            return
    }

    /* renamed from: b */
    public static final boolean m13746b(int r0, int r1) {
            r0 = r0 & r1
            if (r0 != r1) goto L5
            r0 = 1
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }
}
