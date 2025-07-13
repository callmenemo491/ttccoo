package p248o6;

/* renamed from: o6.k0 */
/* loaded from: classes.dex */
public final class C4917k0 implements android.os.Parcelable.Creator<p248o6.C4908g> {
    public C4917k0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p248o6.C4908g createFromParcel(android.os.Parcel r20) {
            r19 = this;
            r0 = r20
            int r1 = p270p6.C5368b.m11710t(r20)
            r2 = 0
            r3 = 0
            r8 = r3
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r18 = r14
            r5 = 0
            r6 = 0
            r7 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L19:
            int r2 = r20.dataPosition()
            if (r2 >= r1) goto L88
            int r2 = r20.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            switch(r3) {
                case 1: goto L83;
                case 2: goto L7e;
                case 3: goto L79;
                case 4: goto L74;
                case 5: goto L6f;
                case 6: goto L65;
                case 7: goto L60;
                case 8: goto L56;
                case 9: goto L2a;
                case 10: goto L4c;
                case 11: goto L42;
                case 12: goto L3d;
                case 13: goto L38;
                case 14: goto L33;
                case 15: goto L2e;
                default: goto L2a;
            }
        L2a:
            p270p6.C5368b.m11709s(r0, r2)
            goto L19
        L2e:
            java.lang.String r18 = p270p6.C5368b.m11695e(r0, r2)
            goto L19
        L33:
            boolean r17 = p270p6.C5368b.m11700j(r0, r2)
            goto L19
        L38:
            int r16 = p270p6.C5368b.m11705o(r0, r2)
            goto L19
        L3d:
            boolean r15 = p270p6.C5368b.m11700j(r0, r2)
            goto L19
        L42:
            android.os.Parcelable$Creator<k6.d> r3 = p184k6.C3701d.CREATOR
            java.lang.Object[] r2 = p270p6.C5368b.m11697g(r0, r2, r3)
            r14 = r2
            k6.d[] r14 = (p184k6.C3701d[]) r14
            goto L19
        L4c:
            android.os.Parcelable$Creator<k6.d> r3 = p184k6.C3701d.CREATOR
            java.lang.Object[] r2 = p270p6.C5368b.m11697g(r0, r2, r3)
            r13 = r2
            k6.d[] r13 = (p184k6.C3701d[]) r13
            goto L19
        L56:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            r12 = r2
            android.accounts.Account r12 = (android.accounts.Account) r12
            goto L19
        L60:
            android.os.Bundle r11 = p270p6.C5368b.m11691a(r0, r2)
            goto L19
        L65:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r2 = p270p6.C5368b.m11697g(r0, r2, r3)
            r10 = r2
            com.google.android.gms.common.api.Scope[] r10 = (com.google.android.gms.common.api.Scope[]) r10
            goto L19
        L6f:
            android.os.IBinder r9 = p270p6.C5368b.m11704n(r0, r2)
            goto L19
        L74:
            java.lang.String r8 = p270p6.C5368b.m11695e(r0, r2)
            goto L19
        L79:
            int r7 = p270p6.C5368b.m11705o(r0, r2)
            goto L19
        L7e:
            int r6 = p270p6.C5368b.m11705o(r0, r2)
            goto L19
        L83:
            int r5 = p270p6.C5368b.m11705o(r0, r2)
            goto L19
        L88:
            p270p6.C5368b.m11699i(r0, r1)
            o6.g r0 = new o6.g
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p248o6.C4908g[] newArray(int r1) {
            r0 = this;
            o6.g[] r1 = new p248o6.C4908g[r1]
            return r1
    }
}
