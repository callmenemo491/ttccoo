package p358uc;

/* renamed from: uc.e */
/* loaded from: classes.dex */
public class C6376e {

    /* renamed from: a */
    public com.eclipsesource.p043v8.C1032V8 f24847a;

    /* renamed from: b */
    public p185k7.C3827h4 f24848b;

    public C6376e(p185k7.C3827h4 r4) {
            r3 = this;
            r3.<init>()
            r3.f24848b = r4
            java.lang.String r4 = "global"
            com.eclipsesource.v8.V8 r4 = com.eclipsesource.p043v8.C1032V8.createV8Runtime(r4)
            r3.f24847a = r4
            k7.h4 r0 = r3.f24848b
            r1 = 2131886083(0x7f120003, float:1.9406735E38)
            java.lang.String r0 = r0.m8571e(r1)
            r4.executeVoidScript(r0)
            uc.b r4 = new uc.b
            r4.<init>(r3)
            com.eclipsesource.v8.V8 r0 = r3.f24847a
            java.lang.String r1 = "JavaLogger"
            r0.registerJavaMethod(r4, r1)
            com.eclipsesource.v8.V8 r4 = r3.f24847a
            k7.h4 r0 = r3.f24848b
            r1 = 2131886080(0x7f120000, float:1.9406729E38)
            java.lang.String r0 = r0.m8571e(r1)
            r4.executeVoidScript(r0)
            uc.c r4 = new uc.c
            r4.<init>(r3)
            uc.d r0 = new uc.d
            r0.<init>(r3)
            com.eclipsesource.v8.V8 r1 = r3.f24847a
            java.lang.String r2 = "encodeFunction"
            r1.registerJavaMethod(r4, r2)
            com.eclipsesource.v8.V8 r4 = r3.f24847a
            java.lang.String r1 = "decodeFunction"
            r4.registerJavaMethod(r0, r1)
            com.eclipsesource.v8.V8 r4 = r3.f24847a
            k7.h4 r0 = r3.f24848b
            r1 = 2131886081(0x7f120001, float:1.940673E38)
            java.lang.String r0 = r0.m8571e(r1)
            r4.executeVoidScript(r0)
            com.eclipsesource.v8.V8 r4 = r3.f24847a
            k7.h4 r0 = r3.f24848b
            r1 = 2131886082(0x7f120002, float:1.9406733E38)
            java.lang.String r0 = r0.m8571e(r1)
            r4.executeVoidScript(r0)
            return
    }

    /* renamed from: a */
    public void m13019a(p394wc.InterfaceC6830a r4, p414xc.C7027b r5) {
            r3 = this;
            xc.c r0 = r5.getData()
            boolean r0 = r0.isPacked()
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.String r0 = "(function() {\nlet contract = "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            boolean r1 = r5.isIdentity()
            if (r1 == 0) goto L1a
            java.lang.String r4 = "global.getContract(global.abi.data)"
            goto L38
        L1a:
            java.lang.String r1 = "global.getContract("
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            xc.a r2 = r5.getAccount()
            java.lang.String r2 = r2.getName()
            java.lang.String r4 = r4.mo13491a(r2)
            r1.append(r4)
            java.lang.String r4 = ")"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
        L38:
            java.lang.String r1 = "\nlet serializedActionData = global.Serialize.serializeActionData(contract, '%s', '%s', %s, {encode: global.encodeFunction}, {decode: global.decodeFunction})\nreturn serializedActionData\n})()"
            java.lang.String r4 = p346u.C6269n.m12888a(r0, r4, r1)
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            xc.a r2 = r5.getAccount()
            java.lang.String r2 = r2.getName()
            r0[r1] = r2
            r1 = 1
            xc.d r2 = r5.getName()
            java.lang.String r2 = r2.getName()
            r0[r1] = r2
            r1 = 2
            xc.c r2 = r5.getData()
            java.lang.String r2 = r2.toJSON()
            r0[r1] = r2
            java.lang.String r4 = java.lang.String.format(r4, r0)
            com.eclipsesource.v8.V8 r0 = r3.f24847a
            java.lang.String r4 = r0.executeStringScript(r4)
            xc.c r5 = r5.getData()
            r5.setData(r4)
            return
    }
}
