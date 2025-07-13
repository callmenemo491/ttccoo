package p228n1;

@java.lang.Deprecated
/* renamed from: n1.c */
/* loaded from: classes.dex */
public final class C4670c {

    /* renamed from: a */
    public static final /* synthetic */ int f18610a = 0;

    static {
            android.security.keystore.KeyGenParameterSpec$Builder r0 = new android.security.keystore.KeyGenParameterSpec$Builder
            r1 = 3
            java.lang.String r2 = "_androidx_security_master_key_"
            r0.<init>(r2, r1)
            java.lang.String r1 = "GCM"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setBlockModes(r1)
            java.lang.String r1 = "NoPadding"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setEncryptionPaddings(r1)
            r1 = 256(0x100, float:3.59E-43)
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setKeySize(r1)
            r0.build()
            return
    }
}
