package p036c6;

/* renamed from: c6.b1 */
/* loaded from: classes.dex */
public final class C0876b1 implements android.os.Parcelable.Creator<com.google.android.gms.cast.CastDevice> {
    public C0876b1() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.cast.CastDevice createFromParcel(android.os.Parcel r23) {
            r22 = this;
            r0 = r23
            int r1 = p270p6.C5368b.m11710t(r23)
            r2 = 0
            r3 = 0
            r4 = -1
            r6 = r3
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r12 = r10
            r15 = r12
            r16 = r15
            r18 = r16
            r19 = r18
            r20 = r19
            r11 = 0
            r13 = 0
            r14 = -1
            r17 = 0
            r21 = 0
        L1f:
            int r2 = r23.dataPosition()
            if (r2 >= r1) goto La1
            int r2 = r23.readInt()
            r4 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r2
            switch(r4) {
                case 2: goto L9b;
                case 3: goto L96;
                case 4: goto L91;
                case 5: goto L8c;
                case 6: goto L87;
                case 7: goto L81;
                case 8: goto L7a;
                case 9: goto L74;
                case 10: goto L6e;
                case 11: goto L69;
                case 12: goto L64;
                case 13: goto L5d;
                case 14: goto L58;
                case 15: goto L40;
                case 16: goto L3b;
                case 17: goto L34;
                default: goto L30;
            }
        L30:
            p270p6.C5368b.m11709s(r0, r2)
            goto L1f
        L34:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r21 = r2
            goto L1f
        L3b:
            java.lang.String r20 = p270p6.C5368b.m11695e(r0, r2)
            goto L1f
        L40:
            int r2 = p270p6.C5368b.m11708r(r0, r2)
            int r4 = r23.dataPosition()
            if (r2 != 0) goto L4d
            r19 = r3
            goto L1f
        L4d:
            byte[] r5 = r23.createByteArray()
            int r4 = r4 + r2
            r0.setDataPosition(r4)
            r19 = r5
            goto L1f
        L58:
            java.lang.String r18 = p270p6.C5368b.m11695e(r0, r2)
            goto L1f
        L5d:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r17 = r2
            goto L1f
        L64:
            java.lang.String r16 = p270p6.C5368b.m11695e(r0, r2)
            goto L1f
        L69:
            java.lang.String r15 = p270p6.C5368b.m11695e(r0, r2)
            goto L1f
        L6e:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r14 = r2
            goto L1f
        L74:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r13 = r2
            goto L1f
        L7a:
            android.os.Parcelable$Creator<n6.a> r4 = p233n6.C4691a.CREATOR
            java.util.ArrayList r12 = p270p6.C5368b.m11698h(r0, r2, r4)
            goto L1f
        L81:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r11 = r2
            goto L1f
        L87:
            java.lang.String r10 = p270p6.C5368b.m11695e(r0, r2)
            goto L1f
        L8c:
            java.lang.String r9 = p270p6.C5368b.m11695e(r0, r2)
            goto L1f
        L91:
            java.lang.String r8 = p270p6.C5368b.m11695e(r0, r2)
            goto L1f
        L96:
            java.lang.String r7 = p270p6.C5368b.m11695e(r0, r2)
            goto L1f
        L9b:
            java.lang.String r6 = p270p6.C5368b.m11695e(r0, r2)
            goto L1f
        La1:
            p270p6.C5368b.m11699i(r0, r1)
            com.google.android.gms.cast.CastDevice r0 = new com.google.android.gms.cast.CastDevice
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.cast.CastDevice[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.cast.CastDevice[] r1 = new com.google.android.gms.cast.CastDevice[r1]
            return r1
    }
}
