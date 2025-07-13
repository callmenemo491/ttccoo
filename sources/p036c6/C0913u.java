package p036c6;

/* renamed from: c6.u */
/* loaded from: classes.dex */
public final class C0913u implements android.os.Parcelable.Creator<p036c6.C0871a> {
    public C0913u() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p036c6.C0871a createFromParcel(android.os.Parcel r21) {
            r20 = this;
            r0 = r21
            int r1 = p270p6.C5368b.m11710t(r21)
            r2 = 0
            r4 = 0
            r8 = r2
            r16 = r8
            r6 = r4
            r7 = r6
            r10 = r7
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r18 = r15
            r19 = r18
        L18:
            int r2 = r21.dataPosition()
            if (r2 >= r1) goto L7c
            int r2 = r21.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            switch(r3) {
                case 2: goto L76;
                case 3: goto L70;
                case 4: goto L6a;
                case 5: goto L64;
                case 6: goto L5e;
                case 7: goto L58;
                case 8: goto L52;
                case 9: goto L4c;
                case 10: goto L46;
                case 11: goto L3f;
                case 12: goto L38;
                case 13: goto L2d;
                default: goto L29;
            }
        L29:
            p270p6.C5368b.m11709s(r0, r2)
            goto L18
        L2d:
            android.os.Parcelable$Creator<c6.s> r3 = p036c6.C0909s.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            c6.s r2 = (p036c6.C0909s) r2
            r19 = r2
            goto L18
        L38:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r18 = r2
            goto L18
        L3f:
            long r2 = p270p6.C5368b.m11706p(r0, r2)
            r16 = r2
            goto L18
        L46:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r15 = r2
            goto L18
        L4c:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r14 = r2
            goto L18
        L52:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r13 = r2
            goto L18
        L58:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r12 = r2
            goto L18
        L5e:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r11 = r2
            goto L18
        L64:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r10 = r2
            goto L18
        L6a:
            long r2 = p270p6.C5368b.m11706p(r0, r2)
            r8 = r2
            goto L18
        L70:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r7 = r2
            goto L18
        L76:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r6 = r2
            goto L18
        L7c:
            p270p6.C5368b.m11699i(r0, r1)
            c6.a r0 = new c6.a
            r5 = r0
            r5.<init>(r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r18, r19)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p036c6.C0871a[] newArray(int r1) {
            r0 = this;
            c6.a[] r1 = new p036c6.C0871a[r1]
            return r1
    }
}
