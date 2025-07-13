package p124h7;

/* renamed from: h7.z7 */
/* loaded from: classes.dex */
public class C2979z7 implements p124h7.InterfaceC2943x7 {

    /* renamed from: Y */
    public final /* synthetic */ int f12061Y;

    public C2979z7(int r1) {
            r0 = this;
            r0.f12061Y = r1
            r0.<init>()
            return
    }

    @Override // p124h7.InterfaceC2943x7
    /* renamed from: a */
    public /* bridge */ /* synthetic */ java.lang.Object mo6634a(java.lang.String r2, java.security.Provider r3) {
            r1 = this;
            int r0 = r1.f12061Y
            switch(r0) {
                case 4: goto L6;
                default: goto L5;
            }
        L5:
            goto L12
        L6:
            if (r3 != 0) goto Ld
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)
            goto L11
        Ld:
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2, r3)
        L11:
            return r2
        L12:
            if (r3 != 0) goto L19
            javax.crypto.Mac r2 = javax.crypto.Mac.getInstance(r2)
            goto L1d
        L19:
            javax.crypto.Mac r2 = javax.crypto.Mac.getInstance(r2, r3)
        L1d:
            return r2
    }
}
