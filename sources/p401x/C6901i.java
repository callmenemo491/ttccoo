package p401x;

/* renamed from: x.i */
/* loaded from: classes.dex */
public class C6901i {
    /* renamed from: a */
    public static p401x.C6907o m13988a(p381w.C6765f r7, int r8, java.util.ArrayList<p401x.C6907o> r9, p401x.C6907o r10) {
            if (r8 != 0) goto L5
            int r0 = r7.f26115F0
            goto L7
        L5:
            int r0 = r7.f26117G0
        L7:
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L2f
            if (r10 == 0) goto L11
            int r3 = r10.f26850b
            if (r0 == r3) goto L2f
        L11:
            r3 = 0
        L12:
            int r4 = r9.size()
            if (r3 >= r4) goto L32
            java.lang.Object r4 = r9.get(r3)
            x.o r4 = (p401x.C6907o) r4
            int r5 = r4.f26850b
            if (r5 != r0) goto L2c
            if (r10 == 0) goto L2a
            r10.m14001d(r8, r4)
            r9.remove(r10)
        L2a:
            r10 = r4
            goto L32
        L2c:
            int r3 = r3 + 1
            goto L12
        L2f:
            if (r0 == r2) goto L32
            return r10
        L32:
            r0 = 1
            if (r10 != 0) goto L79
            boolean r3 = r7 instanceof p381w.C6770k
            if (r3 == 0) goto L6f
            r3 = r7
            w.k r3 = (p381w.C6770k) r3
            r4 = 0
        L3d:
            int r5 = r3.f26240I0
            if (r4 >= r5) goto L56
            w.f[] r5 = r3.f26239H0
            r5 = r5[r4]
            if (r8 != 0) goto L4c
            int r6 = r5.f26115F0
            if (r6 == r2) goto L4c
            goto L57
        L4c:
            if (r8 != r0) goto L53
            int r6 = r5.f26117G0
            if (r6 == r2) goto L53
            goto L57
        L53:
            int r4 = r4 + 1
            goto L3d
        L56:
            r6 = -1
        L57:
            if (r6 == r2) goto L6f
            r2 = 0
        L5a:
            int r3 = r9.size()
            if (r2 >= r3) goto L6f
            java.lang.Object r3 = r9.get(r2)
            x.o r3 = (p401x.C6907o) r3
            int r4 = r3.f26850b
            if (r4 != r6) goto L6c
            r10 = r3
            goto L6f
        L6c:
            int r2 = r2 + 1
            goto L5a
        L6f:
            if (r10 != 0) goto L76
            x.o r10 = new x.o
            r10.<init>(r8)
        L76:
            r9.add(r10)
        L79:
            boolean r2 = r10.m13998a(r7)
            if (r2 == 0) goto Lb6
            boolean r2 = r7 instanceof p381w.C6768i
            if (r2 == 0) goto L90
            r2 = r7
            w.i r2 = (p381w.C6768i) r2
            w.d r3 = r2.f26236K0
            int r2 = r2.f26237L0
            if (r2 != 0) goto L8d
            r1 = 1
        L8d:
            r3.m13679b(r1, r9, r10)
        L90:
            if (r8 != 0) goto L9e
            int r0 = r10.f26850b
            r7.f26115F0 = r0
            w.d r0 = r7.f26114F
            r0.m13679b(r8, r9, r10)
            w.d r0 = r7.f26118H
            goto Lae
        L9e:
            int r0 = r10.f26850b
            r7.f26117G0 = r0
            w.d r0 = r7.f26116G
            r0.m13679b(r8, r9, r10)
            w.d r0 = r7.f26120J
            r0.m13679b(r8, r9, r10)
            w.d r0 = r7.f26119I
        Lae:
            r0.m13679b(r8, r9, r10)
            w.d r7 = r7.f26123M
            r7.m13679b(r8, r9, r10)
        Lb6:
            return r10
    }

    /* renamed from: b */
    public static p401x.C6907o m13989b(java.util.ArrayList<p401x.C6907o> r4, int r5) {
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            java.lang.Object r2 = r4.get(r1)
            x.o r2 = (p401x.C6907o) r2
            int r3 = r2.f26850b
            if (r5 != r3) goto L12
            return r2
        L12:
            int r1 = r1 + 1
            goto L5
        L15:
            r4 = 0
            return r4
    }

    /* renamed from: c */
    public static boolean m13990c(p381w.C6765f.a r5, p381w.C6765f.a r6, p381w.C6765f.a r7, p381w.C6765f.a r8) {
            w.f$a r0 = p381w.C6765f.a.f26192b0
            w.f$a r1 = p381w.C6765f.a.f26190Z
            w.f$a r2 = p381w.C6765f.a.f26189Y
            r3 = 0
            r4 = 1
            if (r7 == r2) goto L13
            if (r7 == r1) goto L13
            if (r7 != r0) goto L11
            if (r5 == r1) goto L11
            goto L13
        L11:
            r5 = 0
            goto L14
        L13:
            r5 = 1
        L14:
            if (r8 == r2) goto L1f
            if (r8 == r1) goto L1f
            if (r8 != r0) goto L1d
            if (r6 == r1) goto L1d
            goto L1f
        L1d:
            r6 = 0
            goto L20
        L1f:
            r6 = 1
        L20:
            if (r5 != 0) goto L26
            if (r6 == 0) goto L25
            goto L26
        L25:
            return r3
        L26:
            return r4
    }
}
