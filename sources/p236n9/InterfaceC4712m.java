package p236n9;

/* renamed from: n9.m */
/* loaded from: classes.dex */
public interface InterfaceC4712m<T> {

    /* renamed from: n9.m$a */
    public static class a implements p236n9.InterfaceC4712m<javax.crypto.Cipher> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p236n9.InterfaceC4712m
        /* renamed from: a */
        public javax.crypto.Cipher mo10771a(java.lang.String r1, java.security.Provider r2) {
                r0 = this;
                if (r2 != 0) goto L7
                javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)
                goto Lb
            L7:
                javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1, r2)
            Lb:
                return r1
        }
    }

    /* renamed from: n9.m$b */
    public static class b implements p236n9.InterfaceC4712m<javax.crypto.Mac> {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p236n9.InterfaceC4712m
        /* renamed from: a */
        public javax.crypto.Mac mo10771a(java.lang.String r1, java.security.Provider r2) {
                r0 = this;
                if (r2 != 0) goto L7
                javax.crypto.Mac r1 = javax.crypto.Mac.getInstance(r1)
                goto Lb
            L7:
                javax.crypto.Mac r1 = javax.crypto.Mac.getInstance(r1, r2)
            Lb:
                return r1
        }
    }

    /* renamed from: a */
    T mo10771a(java.lang.String r1, java.security.Provider r2);
}
