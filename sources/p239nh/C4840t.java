package p239nh;

/* renamed from: nh.t */
/* loaded from: classes.dex */
public class C4840t {
    public C4840t() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static java.lang.Object m10855a(java.lang.Object r2, int r3) {
            if (r2 == 0) goto L1f
            boolean r0 = m10856b(r2, r3)
            if (r0 == 0) goto L9
            goto L1f
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "kotlin.jvm.functions.Function"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            m10857c(r2, r3)
            r2 = 0
            throw r2
        L1f:
            return r2
    }

    /* renamed from: b */
    public static boolean m10856b(java.lang.Object r3, int r4) {
            boolean r0 = r3 instanceof ch.InterfaceC0974a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lb9
            boolean r0 = r3 instanceof p239nh.InterfaceC4827g
            if (r0 == 0) goto L12
            nh.g r3 = (p239nh.InterfaceC4827g) r3
            int r3 = r3.mo7456g()
            goto Lb6
        L12:
            boolean r0 = r3 instanceof mh.InterfaceC4609a
            if (r0 == 0) goto L19
            r3 = 0
            goto Lb6
        L19:
            boolean r0 = r3 instanceof mh.InterfaceC4620l
            if (r0 == 0) goto L20
            r3 = 1
            goto Lb6
        L20:
            boolean r0 = r3 instanceof mh.InterfaceC4624p
            if (r0 == 0) goto L27
            r3 = 2
            goto Lb6
        L27:
            boolean r0 = r3 instanceof mh.InterfaceC4625q
            if (r0 == 0) goto L2e
            r3 = 3
            goto Lb6
        L2e:
            boolean r0 = r3 instanceof mh.InterfaceC4626r
            if (r0 == 0) goto L35
            r3 = 4
            goto Lb6
        L35:
            boolean r0 = r3 instanceof mh.InterfaceC4627s
            if (r0 == 0) goto L3c
            r3 = 5
            goto Lb6
        L3c:
            boolean r0 = r3 instanceof mh.InterfaceC4628t
            if (r0 == 0) goto L43
            r3 = 6
            goto Lb6
        L43:
            boolean r0 = r3 instanceof mh.InterfaceC4629u
            if (r0 == 0) goto L4a
            r3 = 7
            goto Lb6
        L4a:
            boolean r0 = r3 instanceof mh.InterfaceC4630v
            if (r0 == 0) goto L52
            r3 = 8
            goto Lb6
        L52:
            boolean r0 = r3 instanceof mh.InterfaceC4631w
            if (r0 == 0) goto L5a
            r3 = 9
            goto Lb6
        L5a:
            boolean r0 = r3 instanceof mh.InterfaceC4610b
            if (r0 == 0) goto L61
            r3 = 10
            goto Lb6
        L61:
            boolean r0 = r3 instanceof mh.InterfaceC4611c
            if (r0 == 0) goto L68
            r3 = 11
            goto Lb6
        L68:
            boolean r0 = r3 instanceof mh.InterfaceC4612d
            if (r0 == 0) goto L6f
            r3 = 12
            goto Lb6
        L6f:
            boolean r0 = r3 instanceof mh.InterfaceC4613e
            if (r0 == 0) goto L76
            r3 = 13
            goto Lb6
        L76:
            boolean r0 = r3 instanceof mh.InterfaceC4614f
            if (r0 == 0) goto L7d
            r3 = 14
            goto Lb6
        L7d:
            boolean r0 = r3 instanceof mh.InterfaceC4615g
            if (r0 == 0) goto L84
            r3 = 15
            goto Lb6
        L84:
            boolean r0 = r3 instanceof mh.InterfaceC4616h
            if (r0 == 0) goto L8b
            r3 = 16
            goto Lb6
        L8b:
            boolean r0 = r3 instanceof mh.InterfaceC4617i
            if (r0 == 0) goto L92
            r3 = 17
            goto Lb6
        L92:
            boolean r0 = r3 instanceof mh.InterfaceC4618j
            if (r0 == 0) goto L99
            r3 = 18
            goto Lb6
        L99:
            boolean r0 = r3 instanceof mh.InterfaceC4619k
            if (r0 == 0) goto La0
            r3 = 19
            goto Lb6
        La0:
            boolean r0 = r3 instanceof mh.InterfaceC4621m
            if (r0 == 0) goto La7
            r3 = 20
            goto Lb6
        La7:
            boolean r0 = r3 instanceof mh.InterfaceC4622n
            if (r0 == 0) goto Lae
            r3 = 21
            goto Lb6
        Lae:
            boolean r3 = r3 instanceof mh.InterfaceC4623o
            if (r3 == 0) goto Lb5
            r3 = 22
            goto Lb6
        Lb5:
            r3 = -1
        Lb6:
            if (r3 != r4) goto Lb9
            goto Lba
        Lb9:
            r1 = 0
        Lba:
            return r1
    }

    /* renamed from: c */
    public static void m10857c(java.lang.Object r1, java.lang.String r2) {
            if (r1 != 0) goto L5
            java.lang.String r1 = "null"
            goto Ld
        L5:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
        Ld:
            java.lang.String r0 = " cannot be cast to "
            java.lang.String r1 = android.support.v4.media.C0145d.m257a(r1, r0, r2)
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            r2.<init>(r1)
            java.lang.Class<nh.t> r1 = p239nh.C4840t.class
            java.lang.String r1 = r1.getName()
            p214m2.C4339q.m9710t(r2, r1)
            throw r2
    }
}
