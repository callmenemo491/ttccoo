package p379vh;

/* renamed from: vh.x */
/* loaded from: classes.dex */
public final class C6751x {

    /* renamed from: a */
    public static final boolean f26048a = false;

    static {
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = p074e9.C1805a.m4536u(r0)
            if (r0 == 0) goto L53
            int r1 = r0.hashCode()
            if (r1 == 0) goto L2a
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L21
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L33
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            r0 = 0
            goto L54
        L21:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            goto L53
        L2a:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            goto L53
        L33:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L53:
            r0 = 1
        L54:
            p379vh.C6751x.f26048a = r0
            return
    }

    /* renamed from: a */
    public static final p101fh.InterfaceC2175g m13668a(p379vh.InterfaceC6686b0 r1, p101fh.InterfaceC2175g r2) {
            fh.g r1 = r1.mo1407l()
            fh.g r1 = r1.plus(r2)
            vh.z r2 = p379vh.C6716l0.f26007a
            if (r1 == r2) goto L1a
            int r0 = p101fh.InterfaceC2173e.f9915a
            fh.e$a r0 = p101fh.InterfaceC2173e.a.f9916Y
            fh.g$a r0 = r1.get(r0)
            if (r0 != 0) goto L1a
            fh.g r1 = r1.plus(r2)
        L1a:
            return r1
    }

    /* renamed from: b */
    public static final p379vh.C6744u1<?> m13669b(p101fh.InterfaceC2172d<?> r2, p101fh.InterfaceC2175g r3, java.lang.Object r4) {
            boolean r0 = r2 instanceof p134hh.InterfaceC3043d
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            vh.v1 r0 = p379vh.C6747v1.f26045Y
            fh.g$a r0 = r3.get(r0)
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 != 0) goto L14
            return r1
        L14:
            hh.d r2 = (p134hh.InterfaceC3043d) r2
        L16:
            boolean r0 = r2 instanceof p379vh.C6707i0
            if (r0 == 0) goto L1b
            goto L29
        L1b:
            hh.d r2 = r2.mo5742j()
            if (r2 != 0) goto L22
            goto L29
        L22:
            boolean r0 = r2 instanceof p379vh.C6744u1
            if (r0 == 0) goto L16
            r1 = r2
            vh.u1 r1 = (p379vh.C6744u1) r1
        L29:
            if (r1 != 0) goto L2c
            goto L30
        L2c:
            r1.f26042b0 = r3
            r1.f26043c0 = r4
        L30:
            return r1
    }
}
