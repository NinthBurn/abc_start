package web_diggers.abc_backend.security.password;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PasswordChangeRequest {
    @Schema(
            description = "User's email associated with the request",
            name = "email",
            type = "string"
    )
    private String email;

    @Schema(
            description = "User-inputted token from email",
            name = "token",
            nullable = true,
            type = "string"
    )
    private String token;

    @Schema(
            description = "New password chosen by user",
            name = "newPassword",
            nullable = true,
            type = "string"
    )
    private String newPassword;

    @Schema(
            description = "Old password remembered by user",
            name = "oldPassword",
            nullable = true,
            type = "string"
    )
    private String oldPassword;
}
