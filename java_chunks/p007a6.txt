package p007a6;

/* renamed from: a6.a */
/* loaded from: classes.dex */
public final class C0026a implements android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> {
    public C0026a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount createFromParcel(android.os.Parcel r21) {
            r20 = this;
            r0 = r21
            int r1 = p270p6.C5368b.m11710t(r21)
            r2 = 0
            r3 = 0
            r4 = 0
            r8 = r2
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r16 = r13
            r17 = r16
            r18 = r17
            r19 = r18
            r14 = r4
            r7 = 0
        L1a:
            int r2 = r21.dataPosition()
            if (r2 >= r1) goto L72
            int r2 = r21.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            switch(r3) {
                case 1: goto L6d;
                case 2: goto L68;
                case 3: goto L63;
                case 4: goto L5e;
                case 5: goto L59;
                case 6: goto L4f;
                case 7: goto L4a;
                case 8: goto L45;
                case 9: goto L40;
                case 10: goto L39;
                case 11: goto L34;
                case 12: goto L2f;
                default: goto L2b;
            }
        L2b:
            p270p6.C5368b.m11709s(r0, r2)
            goto L1a
        L2f:
            java.lang.String r19 = p270p6.C5368b.m11695e(r0, r2)
            goto L1a
        L34:
            java.lang.String r18 = p270p6.C5368b.m11695e(r0, r2)
            goto L1a
        L39:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.util.ArrayList r17 = p270p6.C5368b.m11698h(r0, r2, r3)
            goto L1a
        L40:
            java.lang.String r16 = p270p6.C5368b.m11695e(r0, r2)
            goto L1a
        L45:
            long r14 = p270p6.C5368b.m11706p(r0, r2)
            goto L1a
        L4a:
            java.lang.String r13 = p270p6.C5368b.m11695e(r0, r2)
            goto L1a
        L4f:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            r12 = r2
            android.net.Uri r12 = (android.net.Uri) r12
            goto L1a
        L59:
            java.lang.String r11 = p270p6.C5368b.m11695e(r0, r2)
            goto L1a
        L5e:
            java.lang.String r10 = p270p6.C5368b.m11695e(r0, r2)
            goto L1a
        L63:
            java.lang.String r9 = p270p6.C5368b.m11695e(r0, r2)
            goto L1a
        L68:
            java.lang.String r8 = p270p6.C5368b.m11695e(r0, r2)
            goto L1a
        L6d:
            int r7 = p270p6.C5368b.m11705o(r0, r2)
            goto L1a
        L72:
            p270p6.C5368b.m11699i(r0, r1)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = new com.google.android.gms.auth.api.signin.GoogleSignInAccount
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.signin.GoogleSignInAccount[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.auth.api.signin.GoogleSignInAccount[] r1 = new com.google.android.gms.auth.api.signin.GoogleSignInAccount[r1]
            return r1
    }
}
