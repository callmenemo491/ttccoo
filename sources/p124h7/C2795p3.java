package p124h7;

/* renamed from: h7.p3 */
/* loaded from: classes.dex */
public final class C2795p3 implements p124h7.InterfaceC2883u1 {

    /* renamed from: Y */
    public final android.content.SharedPreferences.Editor f11823Y;

    public C2795p3(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            if (r3 != 0) goto Le
            android.content.SharedPreferences r2 = android.preference.PreferenceManager.getDefaultSharedPreferences(r2)
            goto L13
        Le:
            r0 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r0)
        L13:
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r1.f11823Y = r2
            return
    }

    @Override // p124h7.InterfaceC2883u1
    /* renamed from: l */
    public final void mo4786l(p124h7.C2852s6 r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.f11823Y
            byte[] r3 = r3.mo7142p()
            java.lang.String r3 = p036c6.C0906q0.m2616d(r3)
            java.lang.String r1 = "GenericIdpKeyset"
            android.content.SharedPreferences$Editor r3 = r0.putString(r1, r3)
            boolean r3 = r3.commit()
            if (r3 == 0) goto L17
            return
        L17:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Failed to write to SharedPreferences"
            r3.<init>(r0)
            throw r3
    }

    @Override // p124h7.InterfaceC2883u1
    /* renamed from: o */
    public final void mo4787o(p124h7.C2959y5 r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.f11823Y
            byte[] r3 = r3.mo7142p()
            java.lang.String r3 = p036c6.C0906q0.m2616d(r3)
            java.lang.String r1 = "GenericIdpKeyset"
            android.content.SharedPreferences$Editor r3 = r0.putString(r1, r3)
            boolean r3 = r3.commit()
            if (r3 == 0) goto L17
            return
        L17:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Failed to write to SharedPreferences"
            r3.<init>(r0)
            throw r3
    }
}
