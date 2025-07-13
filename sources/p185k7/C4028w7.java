package p185k7;

/* renamed from: k7.w7 */
/* loaded from: classes.dex */
public final class C4028w7 extends p185k7.AbstractC3822h {

    /* renamed from: a0 */
    public final /* synthetic */ int f16929a0;

    /* renamed from: b0 */
    public final androidx.appcompat.widget.C0311x f16930b0;

    public C4028w7(androidx.appcompat.widget.C0311x r2) {
            r1 = this;
            r0 = 0
            r1.f16929a0 = r0
            r1.f16930b0 = r2
            java.lang.String r2 = "getValue"
            r1.<init>(r2)
            return
    }

    public C4028w7(java.lang.String r2, androidx.appcompat.widget.C0311x r3) {
            r1 = this;
            r2 = 1
            r1.f16929a0 = r2
            java.lang.String r2 = "internal.remoteConfig"
            r1.<init>(r2)
            r1.f16930b0 = r3
            java.util.Map<java.lang.String, k7.o> r2 = r1.f16657Z
            k7.w7 r0 = new k7.w7
            r0.<init>(r3)
            java.lang.String r3 = "getValue"
            r2.put(r3, r0)
            return
    }

    @Override // p185k7.AbstractC3822h
    /* renamed from: b */
    public final p185k7.InterfaceC3916o mo8522b(p365v.C6476c r3, java.util.List r4) {
            r2 = this;
            int r0 = r2.f16929a0
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            k7.o r3 = p185k7.InterfaceC3916o.f16782G
            return r3
        L8:
            r0 = 2
            java.lang.String r1 = "getValue"
            p124h7.C2939x3.m7264N(r1, r0, r4)
            r0 = 0
            java.lang.Object r0 = r4.get(r0)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r3.m13117i(r0)
            r1 = 1
            java.lang.Object r4 = r4.get(r1)
            k7.o r4 = (p185k7.InterfaceC3916o) r4
            k7.o r3 = r3.m13117i(r4)
            java.lang.String r4 = r0.mo8357i()
            androidx.appcompat.widget.x r0 = r2.f16930b0
            java.lang.Object r1 = r0.f1482a0
            o7.a4 r1 = (p249o7.C4953a4) r1
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r1 = r1.f19565d
            java.lang.Object r0 = r0.f1481Z
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r1.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L4a
            boolean r1 = r0.containsKey(r4)
            if (r1 != 0) goto L43
            goto L4a
        L43:
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            goto L4b
        L4a:
            r4 = 0
        L4b:
            if (r4 == 0) goto L52
            k7.r r3 = new k7.r
            r3.<init>(r4)
        L52:
            return r3
    }
}
